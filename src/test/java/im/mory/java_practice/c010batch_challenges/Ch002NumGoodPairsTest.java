package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch002NumGoodPairsTest {

    @Test
    void solution() {
        Ch002NumGoodPairs c = new Ch002NumGoodPairs();
        assertEquals(4, c.solution(new int[]{1, 2, 3, 1, 1, 3}));
        assertEquals(6, c.solution(new int[]{1, 1, 1, 1}));
        assertEquals(0, c.solution(new int[]{1, 2, 3}));
        assertEquals(0, c.solution(new int[]{10}));
        assertEquals(0, c.solution(new int[]{1, 10}));
    }

    @Test
    void solution2() {
        Ch002NumGoodPairs c = new Ch002NumGoodPairs();
        assertEquals(4, c.solution2(new int[]{1, 2, 3, 1, 1, 3}));
        assertEquals(6, c.solution2(new int[]{1, 1, 1, 1}));
        assertEquals(0, c.solution2(new int[]{1, 2, 3}));
        assertEquals(0, c.solution2(new int[]{10}));
        assertEquals(0, c.solution2(new int[]{1, 10}));
    }
}