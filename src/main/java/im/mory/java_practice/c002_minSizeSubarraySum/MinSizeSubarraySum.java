package im.mory.java_practice.c002_minSizeSubarraySum;

public class MinSizeSubarraySum {
    public int solution(int target, int[] nums) {
        //7
        //min=2
        // 2 3 1 2 |4 3|

        var left = 0;
        var sum = 0;
        int minLength = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target && left <= right) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
