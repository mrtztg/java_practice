package im.mory.java_practice.c010batch_challenges;

import java.util.HashMap;
import java.util.Map;

public class Ch015FruitsIntoBaskets {
    public int findLength(char[] arr) {
        int maxFruits = 0;
        int left = 0;
        Map<Character, Integer> fruitBoxes = new HashMap<>();
        for (int right = 0; right < arr.length; right++) {
            char rightChar = arr[right];
            fruitBoxes.put(rightChar, fruitBoxes.getOrDefault(rightChar, 0) + 1);
            while (fruitBoxes.size() > 2) {
                char leftChar = arr[left];
                int newBoxSize = fruitBoxes.get(leftChar) - 1;
                if (newBoxSize == 0)
                    fruitBoxes.remove(leftChar);
                else
                    fruitBoxes.put(leftChar, newBoxSize);
                left++;
            }
            int fruits = fruitBoxes.values().stream().reduce(0, Integer::sum);
            maxFruits = Math.max(fruits, maxFruits);
        }
        return maxFruits;
    }
}
