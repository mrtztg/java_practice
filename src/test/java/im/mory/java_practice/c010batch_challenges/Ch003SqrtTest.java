package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch003SqrtTest {

    @Test
    void solution() {
        Ch003Sqrt c = new Ch003Sqrt();
        int[] numbers = {8, 2, 23, 10, 36, 5266, 62167, 5356, 715632591};
        for (int num : numbers) {
            int buildInSqrt = (int) Math.floor(Math.sqrt(num));
            int solutionSqrt = c.solution(num);
            assertEquals(buildInSqrt, solutionSqrt, String.format("sqrt of %d should be %d, not %d", num, buildInSqrt, solutionSqrt));
        }
    }
}