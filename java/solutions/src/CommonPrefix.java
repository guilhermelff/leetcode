import java.util.HashMap;
import java.util.Map;

public class CommonPrefix {
    public String longestCommonPrefixFirstTry(String[] strs) {
        Map<Character, Boolean> map = new HashMap<Character,Boolean>();
        map.put('a', true);
        map.put('e', true);
        map.put('i', true);
        map.put('o', true);
        map.put('u', true);

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < strs[0].length(); i++){
            if(map.get(strs.charAt(i)) == null ){
                sb.append(charAt(i));
            }
            else{
                break;
            }
        }

        String prefix;
        prefix = sb.toString();

        boolean contains = false;

        for(int i = 1; i < strs[0].length(); i++){
            if(strs[i].startsWith(prefix)){
                contains = true;
            }
            else{
                contains = false;
            }
        }

        if (contains){
            return prefix;
        }
        else {
            return "";
        }

    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s1 = strs[0];
        String s2 = strs[strs.length-1];
        int idx = 0;
        while(idx < s1.length() && idx < s2.length()){
            if(s1.charAt(idx) == s2.charAt(idx)){
                idx++;
            } else {
                break;
            }
        }
        return s1.substring(0, idx);
    }
}
