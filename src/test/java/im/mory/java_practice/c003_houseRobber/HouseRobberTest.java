package im.mory.java_practice.c003_houseRobber;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HouseRobberTest {
    private HouseRobber h;

    @BeforeEach
    void setUp() {
        h = new HouseRobber();
    }

    @Test
    void testSolution() {
        assertAll(
                () -> assertEquals(4, h.solution(new int[]{1, 2, 3, 1})),
                () -> assertEquals(12, h.solution(new int[]{2, 7, 9, 3, 1})),
                () -> assertEquals(2, h.solution(new int[]{1, 2})),
                () -> assertEquals(2, h.solution(new int[]{2, 1})),
                () -> assertEquals(100, h.solution(new int[]{100})),
                () -> assertEquals(31, h.solution(new int[]{1, 4, 10, 3, 4, 20})),
                () -> assertEquals(15, h.solution(new int[]{2, 5, 1, 2, 10}))
//                () -> assertEquals(15, h.Solution(new int[]{2, 5, 1, 2, 10, 6, 3, 2}))
        );
    }
}
