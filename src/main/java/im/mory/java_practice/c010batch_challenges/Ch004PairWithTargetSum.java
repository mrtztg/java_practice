package im.mory.java_practice.c010batch_challenges;

public class Ch004PairWithTargetSum {
    int[] search(int[] arr, int targetSum) {
        int left = 0, right = arr.length - 1;
        int sum;
        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum == targetSum)
                return new int[]{left, right};
            else if (sum > targetSum)
                right--;
            else
                left++;
        }
        return new int[]{-1, -1};
    }
}
