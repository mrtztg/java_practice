package im.mory.java_practice.c005_search2dMatrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Search2dMatrixTest {
    private Search2dMatrix s;

    @BeforeEach
    void setUp() {
        s = new Search2dMatrix();
    }

    @Test
    void testSolution() {
        assertTrue(s.solution(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
        assertFalse(s.solution(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
    }
}