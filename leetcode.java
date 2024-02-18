class Solution {
    public int romanToInt(String s) {
        boolean valid = true;
        char[] romanLetters = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        if (!(1 <= s.length() && s.length() <=15 )) {
            return 0;
        }
        return 1;
    }
}

public class leetcode {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("IV"));
    }
}
