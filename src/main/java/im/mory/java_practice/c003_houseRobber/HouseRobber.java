package im.mory.java_practice.c003_houseRobber;

import java.util.ArrayList;
import java.util.List;

public class HouseRobber {
    public int Solution(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        List<Integer> vals = new ArrayList<>();
        vals.add(nums[0]);
        vals.add(Math.max(nums[1], vals.get(0)));
        for (int i = 2; i < nums.length; i++) {
            vals.add(Math.max(nums[i] + vals.get(i-2), vals.get(i-1)));
        }
        return vals.get(nums.length - 1);
    }
}
