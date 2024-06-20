package im.mory.java_practice.c010batch_challenges;

public class Ch012MaxSumSubarrayK {
    int findMaxSubSubArray(int k, int[] arr) {
        int left = 0, maxSum = 0, sum = 0;
        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];
            if (right >= k - 1) {
                if (sum > maxSum)
                    maxSum = sum;
                sum -= arr[left];
                left++;
            }
        }
        return maxSum;
    }
}
