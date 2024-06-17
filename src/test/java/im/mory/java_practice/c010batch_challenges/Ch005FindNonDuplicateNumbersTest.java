package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch005FindNonDuplicateNumbersTest {

    @Test
    void solution() {
        Ch005FindNonDuplicateNumbers c = new Ch005FindNonDuplicateNumbers();
        assertEquals(4, c.solution(new int[]{2, 3, 3, 3, 6, 9, 9}));
        assertEquals(2, c.solution(new int[]{2, 2, 2, 11}));
    }
}