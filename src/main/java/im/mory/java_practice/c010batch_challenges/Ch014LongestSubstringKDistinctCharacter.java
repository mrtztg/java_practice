package im.mory.java_practice.c010batch_challenges;

import java.util.HashMap;
import java.util.Map;

public class Ch014LongestSubstringKDistinctCharacter {
    public int findLength(String str, int k) {
        // k < str.len
        Map<Character, Integer> charCount = new HashMap<>();
        int left = 0, right = 0;
        int maxLength = 0;
        for (right = 0; right < str.length(); right++) {
            char rightChar = str.charAt(right);
            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);
            while (charCount.size() > k && left <= right) {
                char leftChar = str.charAt(left);
                int newCount = charCount.get(leftChar) - 1;
                if (newCount > 0)
                    charCount.put(leftChar, newCount);
                else
                    charCount.remove(leftChar);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
