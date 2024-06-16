package im.mory.java_practice.c008_validPalindrome;

public class ValidPalindrome {
    public boolean solution(String s) {
        var chars = s.toCharArray();
        int first = 0, last = chars.length - 1;
        while (first < last) {
            while (first < last && !isAlphaNumeric(chars[first])) {
                first++;
            }
            while (first < last && !isAlphaNumeric(chars[last])) {
                last--;
            }
            if (Character.toLowerCase(chars[first]) != Character.toLowerCase(chars[last])) {
                return false;
            }
            first++;
            last--;
        }
        return true;
    }

    private boolean isAlphaNumeric(char c) {
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }
}
