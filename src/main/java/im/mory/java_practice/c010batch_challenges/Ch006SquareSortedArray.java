package im.mory.java_practice.c010batch_challenges;

/*
Given a sorted array, create a new array containing squares of all the numbers of the input array in the sorted order.

Example 1:

Input: [-2, -1, 0, 2, 3]
Output: [0, 1, 4, 4, 9]
Example 2:

Input: [-3, -1, 0, 1, 2]
Output: [0, 1, 1, 4, 9]
Constraints:

1 <= arr.length <= 104
-104 <= arr[i] <= 104
arr is sorted in non-decreasing order.

*/

public class Ch006SquareSortedArray {
    int[] solution(int[] arr) {
        int left = 0, right = arr.length - 1;
        int[] sortedSquares = new int[arr.length];
        int pos = sortedSquares.length - 1;
        while (left <= right) {
            if (Math.pow(arr[left], 2) > Math.pow(arr[right], 2)) {
                sortedSquares[pos--] = (int) Math.pow(arr[left], 2);
                left++;
            } else {
                sortedSquares[pos--] = (int) Math.pow(arr[right], 2);
                right--;
            }
        }
        return sortedSquares;
    }
}
