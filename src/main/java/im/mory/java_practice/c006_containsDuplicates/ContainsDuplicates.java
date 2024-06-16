package im.mory.java_practice.c006_containsDuplicates;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicates {
    public boolean solution(int[] nums) {
        Set<Integer> duplicates = new HashSet<>();
        for (int num : nums) {
            if (duplicates.contains(num)) {
                return true;
            } else {
                duplicates.add(num);
            }
        }
        return false;
    }
}
