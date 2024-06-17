package im.mory.java_practice.c010batch_challenges;

public class Ch001_ShortestWordsDistance {
    int solution(String [] words, String word1, String word2) {
        int last1Idx = -1, last2Idx = -1;
        int shortestDistance = Integer.MAX_VALUE;
        for (int i = 0; i < words.length; i++) {
            var word = words[i];
            if (word.equals(word1))
                last1Idx = i;
            else if (word.equals(word2))
                last2Idx = i;
            int distance = Math.abs(last1Idx - last2Idx);
            if (last1Idx >= 0 && last2Idx >= 0 && distance < shortestDistance) {
                shortestDistance = distance;
            }
        }
        return shortestDistance;
    }
}
