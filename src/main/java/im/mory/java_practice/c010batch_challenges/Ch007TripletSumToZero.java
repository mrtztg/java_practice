package im.mory.java_practice.c010batch_challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of unsorted numbers, find all unique triplets in it that add up to zero.

Example 1:

Input: [-3, 0, 1, 2, -1, 1, -2]
Output: [[-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]]
Explanation: There are four unique triplets whose sum is equal to zero. smallest sum.'
Example 2:

Input: [-5, 2, -1, -2, 3]
Output: [[-5, 2, 3], [-2, -1, 3]]
Explanation: There are two unique triplets whose sum is equal to zero.
Constraints:

3 <= arr.length <= 3000
-105 <= arr[i] <= 105
*/

public class Ch007TripletSumToZero {
    List<List<Integer>> solution2(int[] arr) { // Wrong solution
        List<List<Integer>> triples = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0)
                        triples.add(Arrays.asList(arr[i], arr[j], arr[k]));
                }
            }
        }
        System.out.println(triples);
        return triples;
    }

    List<List<Integer>> solution(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> triples = new ArrayList<>();
        for (int left = 0; left < arr.length - 2; left++) {
            if (left > 0 && arr[left] == arr[left - 1]) // skip duplicates
                continue;
            int middle = left + 1, right = arr.length - 1;
            while (middle < right) {
                if (middle - 1 > left && arr[middle] == arr[middle - 1]) { // skip duplicates
                    middle++;
                    continue;
                } else if (right + 1 < arr.length && arr[right] == arr[right + 1]) { // skip duplicates
                    right--;
                    continue;
                }
                int sum = arr[left] + arr[middle] + arr[right];
                if (sum == 0) {
                    triples.add(Arrays.asList(arr[left], arr[middle], arr[right]));
                    middle++;
                    right--;
                } else if (sum > 0) { // we need to decrease sum. So, move 'right' to left.
                    right--;
                } else { // we need to increase sum. Some, move 'middle' to right.
                    middle++;
                }
            }
        }
        return triples;
    }


}
