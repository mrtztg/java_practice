package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch004PairWithTargetSumTest {
    @Test
    void search() {
        List<TestCase> testCases = List.of(
                new TestCase(new int[]{1, 2, 3, 4, 6}, 6),
                new TestCase(new int[]{2, 5, 9, 11}, 11)
        );
        Ch004PairWithTargetSum c = new Ch004PairWithTargetSum();
        for (TestCase t : testCases) {
            int[] result = c.search(t.input(), t.target());
            System.out.println(Arrays.toString(result));
            assertTrue(result[0] < t.input().length, "index1 doesn't exist in input");
            assertTrue(result[1] < t.input().length, "index2 doesn't exist in input");
            assertTrue(t.input()[result[0]] + t.input()[result[1]] == t.target(), String.format("Sum=%d+%d but Target=%d",
                    t.input()[result[0]], t.input()[result[1]], t.target()));
        }
    }
}

record TestCase(int[] input, int target) {
}