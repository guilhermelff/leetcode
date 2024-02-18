package RomanNumbersUtils;

class RomanNumbersUtils {
    public int romanToInt(String s) {
        boolean valid = true;
        char[] romanNumbers = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        if (!(1 <= s.length() && s.length() <=15 )) {
            return 0;
        }
        return 1;
    }
}
