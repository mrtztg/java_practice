package im.mory.java_practice.c006_containsDuplicates;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {
    private ContainsDuplicates c;

    @BeforeEach
    void setUp() {
        c = new ContainsDuplicates();
    }

    @Test
    void solution() {
        assertAll(
                () -> assertFalse(c.solution(new int[]{1, 2, 3, 4})),
                () -> assertTrue(c.solution(new int[]{1, 2, 3, 1}))
        );
    }
}