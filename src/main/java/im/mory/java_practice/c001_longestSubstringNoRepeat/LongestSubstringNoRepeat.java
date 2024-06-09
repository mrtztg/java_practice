package im.mory.java_practice.c001_longestSubstringNoRepeat;

import java.util.HashMap;

public class LongestSubstringNoRepeat {
    public int solution(String s) {
        var left = 0;
        var charIndex = new HashMap<Character, Integer>();
        var maxLength = 0;
        for (var right = 0; right < s.length(); right++) {
            Integer latestRightCopyIdx = charIndex.getOrDefault(s.charAt(right), -1);
            if (latestRightCopyIdx >= left) {
                left = latestRightCopyIdx + 1;
            }
            charIndex.put(s.charAt(right), right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
