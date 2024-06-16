package im.mory.java_practice.c007_reverseVowels;

import java.util.Set;

public class ReverseVowels {
    public String solution(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        int first = 0, last = s.length() - 1;
        var sArr = s.toCharArray();
        while (first < last) {
            while (first < last && !vowels.contains(sArr[first]))
                first++;
            while (first < last && !vowels.contains(sArr[last]))
                last--;
            var temp = sArr[first];
            sArr[first] = sArr[last];
            sArr[last] = temp;
            first++;
            last--;
        }
        return new String(sArr);
    }
}
