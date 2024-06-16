package im.mory.java_practice.c009_validAnagram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidAnagram {
    boolean solution(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;
        Map<Character, Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
            freq.put(t.charAt(i), freq.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (Character c : freq.keySet()) {
            if (freq.get(c) != 0)
                return false;
        }
        return true;
    }
}
