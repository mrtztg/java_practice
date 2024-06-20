package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch013SmallestSubarrayWithGreaterSumTest {

    @Test
    void findMinSubArray() {
        Ch013SmallestSubarrayWithGreaterSum c = new Ch013SmallestSubarrayWithGreaterSum();
        assertEquals(2, c.findMinSubArray(7, new int[]{2, 1, 5, 2, 3, 2}));
        assertEquals(1, c.findMinSubArray(7, new int[]{2, 1, 5, 2, 8}));
        assertEquals(3, c.findMinSubArray(8, new int[]{3, 4, 1, 1, 6}));
    }
}