package im.mory.java_practice.c001_longestSubstringNoRepeat;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringNoRepeat {
    public int solution(String str) {
        if (str.length() <= 1 ) {
            return str.length();
        }
        char[] strArr = str.toCharArray();
        int windowLength = 0;
        int maxWindowLength = 0;
        Map<Character, Void> charsInWindow = new HashMap<>();
        Character c;
        for (int windowRight = 1; windowRight < strArr.length; windowRight++) {
            c = strArr[windowRight];
            if (!charsInWindow.containsKey(c)) {
                windowLength++;
                charsInWindow.put(c, null);
            }
            maxWindowLength = Math.max(windowLength, maxWindowLength);
        }
        return maxWindowLength;
    }
}
