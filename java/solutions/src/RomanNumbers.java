import java.util.HashMap;
import java.util.Map;

public class RomanNumbers {
    public static int romanToInt(String s) {
        if (!(!s.isEmpty() && s.length() <=15 )) {
            return 0;
        }
        if (!(s.contains("I") || s.contains("V") || s.contains("X") || s.contains("L") || s.contains("C") || s.contains("D") || s.contains("M"))) {
            return 0;
        }

        Map<Character,Integer> map = new HashMap<Character,Integer>();

        int sum = 0;

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");

        for(int i=0;i<s.length();i++){
            sum = sum + (map.get(s.charAt(i)));
        }
        return sum;
        }
}

