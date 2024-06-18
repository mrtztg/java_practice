package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch008TripleSumCloseToTargetTest {

    @Test
    void solution() {
        Ch008TripleSumCloseToTarget c = new Ch008TripleSumCloseToTarget();
        assertEquals(0, c.solution(new int[]{-3, -1, 1, 2}, 1));
        assertEquals(3, c.solution(new int[]{1, 0, 1, 1}, 100));
        assertEquals(2, c.solution(new int[]{-1, 0, 2, 3}, 3));
        assertEquals(4, c.solution(new int[]{0, 0, 1, 1, 2, 6}, 5));
    }
}