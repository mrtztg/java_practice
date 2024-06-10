package im.mory.java_practice.c002_minSizeSubarraySum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinSizeSubarraySumTest {
    private MinSizeSubarraySum m;

    @BeforeEach
    void setUp() {
        m = new MinSizeSubarraySum();
    }

    @Test
    void testSolution() {
        assertAll(
                () -> assertEquals(2, m.solution(7, new int[]{2,3,1,2,4,3})),
                () -> assertEquals(1, m.solution(4, new int[]{1,4,4})),
                () -> assertEquals(0, m.solution(11, new int[]{1,1,1,1,1,1,1,1}))
        );
    }
}