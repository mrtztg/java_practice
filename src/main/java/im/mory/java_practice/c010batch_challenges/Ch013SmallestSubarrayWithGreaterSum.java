package im.mory.java_practice.c010batch_challenges;

public class Ch013SmallestSubarrayWithGreaterSum {
    int findMinSubArray(int S, int[] arr) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            while (sum >= S && left <= right) {
                int thisLength = right - left + 1;
                minLength = Math.min(thisLength, minLength);
                sum-= arr[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0: minLength;
    }
}
