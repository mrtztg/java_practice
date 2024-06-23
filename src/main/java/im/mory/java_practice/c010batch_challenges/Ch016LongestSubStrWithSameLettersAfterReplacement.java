package im.mory.java_practice.c010batch_challenges;

import java.util.*;

public class Ch016LongestSubStrWithSameLettersAfterReplacement {
    public int findLength2(String str, int k) {
        Set<Character> mostFrequentChars = new HashSet<>();
        int mostFrequent = 0;
        int maxMostFrequent = 0;
        int left = 0;
        Map<Character, Integer> frequency = new HashMap<>();
        for (int right = 0; right < str.length(); right++) {
            char rightChar = str.charAt(right);
            int rightCharNewFrequency = frequency.getOrDefault(rightChar, 0) + 1;
            frequency.put(rightChar, rightCharNewFrequency);
            if (rightCharNewFrequency >= mostFrequent) {
                if (rightCharNewFrequency > mostFrequent)
                    mostFrequentChars.clear();
                mostFrequentChars.add(rightChar);
                mostFrequent = rightCharNewFrequency;
            }
            while (mostFrequent + k < right - left + 1) {
                char leftChar = str.charAt(left);
                frequency.put(leftChar, frequency.get(leftChar) - 1);
                if (mostFrequentChars.contains(leftChar)) {
                    mostFrequentChars.remove(leftChar);
                    if (mostFrequentChars.isEmpty()) {
                        mostFrequent--;
                    }
                }
                left++;
            }
            maxMostFrequent = Math.max(mostFrequent, maxMostFrequent);
        }
        return maxMostFrequent + k;
    }

    public int findLength(String str, int k) {
        int left = 0, maxLength = 0, maxRepeatLetterCount = 0;
        Map<Character, Integer> letterFrequencyMap = new HashMap<>();
        for (int right = 0; right < str.length(); right++) {
            char rightChar = str.charAt(right);
            letterFrequencyMap.put(rightChar, letterFrequencyMap.getOrDefault(rightChar, 0) + 1);
            maxRepeatLetterCount = Math.max(maxRepeatLetterCount, letterFrequencyMap.get(rightChar));
            if (right - left + 1 > k + maxRepeatLetterCount) {
                char leftChar = str.charAt(left);
                letterFrequencyMap.put(leftChar, letterFrequencyMap.get(leftChar) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
