package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch006SquareSortedArrayTest {

    @Test
    void solution() {
        Ch006SquareSortedArray c = new Ch006SquareSortedArray();
        assertArrayEquals(new int[]{0, 1, 4, 4, 9}, c.solution(new int[]{-2, -1, 0, 2, 3}));
        assertArrayEquals(new int[]{0, 1, 1, 4, 9}, c.solution(new int[]{-3, -1, 0, 1, 2}));
    }
}