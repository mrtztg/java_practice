package im.mory.java_practice.c010batch_challenges;

import java.util.HashMap;
import java.util.Map;

public class Ch002NumGoodPairs {
    int solution2(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (Integer num : nums)
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        var pairCount = 0;
        for (Integer key : counts.keySet()) {
            var val = counts.get(key);
            if (val > 1)
                pairCount += combinations(val);
        }
        return pairCount;
    }

    private final Map<Integer, Integer> combinationsCache = new HashMap<>();

    int combinations(int count) {
        if (combinationsCache.containsKey(count))
            return combinationsCache.get(count);
        int combinations = 0;
        for (int i = 0; i < count - 1; i++)
            for (int j = i + 1; j < count; j++)
                combinations++;
        combinationsCache.put(count, combinations);
        return combinations;
    }

    int solution(int[] nums) {
        var pairCount = 0;
        Map<Integer, Integer> numCounts = new HashMap<>();
        for (Integer num : nums) {
            int countOfThisNum = numCounts.getOrDefault(num, 0) + 1; // increment the count of 'n' in the map
            // every new occurrence of a number can be paired with every previous occurrence
            // so if a number has already appeared 'p' times, we will have 'p-1' new pairs
            numCounts.put(num, countOfThisNum);
            pairCount += countOfThisNum - 1;
        }
        return pairCount;
    }
}
