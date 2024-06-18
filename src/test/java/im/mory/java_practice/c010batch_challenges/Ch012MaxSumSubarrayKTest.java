package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch012MaxSumSubarrayKTest {

    @Test
    void findMaxSubSubArray() {
        Ch012MaxSumSubarrayK c = new Ch012MaxSumSubarrayK();
        assertEquals(9, c.findMaxSubSubArray(3, new int[]{2, 1, 5, 1, 3, 2}));
        assertEquals(7, c.findMaxSubSubArray(2, new int[]{2, 3, 4, 1, 5}));
    }
}