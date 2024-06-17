package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Ch007TripletSumToZeroTest {

    @Test
    void solution() {
        Ch007TripletSumToZero c = new Ch007TripletSumToZero();

        var expectedJson = Arrays.asList(
                Arrays.asList(-3, 1, 2),
                Arrays.asList(-2, 0, 2),
                Arrays.asList(-2, 1, 1),
                Arrays.asList(-1, 0, 1)
        );
        assertEquals(expectedJson, c.solution2(new int[]{-3, 0, 1, 2, -1, 1, -2}));

        expectedJson = Arrays.asList(
                Arrays.asList(-5, 2, 3),
                Arrays.asList(-2, -1, 3)
        );
        assertEquals(expectedJson, c.solution2(new int[]{-5, 2, -1, -2, 3}));

        expectedJson = List.of(
                Arrays.asList(0, 0, 0)
        );
        assertEquals(expectedJson, c.solution2(new int[]{0, 0, 0}));
    }
}