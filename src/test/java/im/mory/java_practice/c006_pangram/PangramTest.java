package im.mory.java_practice.c006_pangram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramTest {
    private Pangram p;

    @BeforeEach
    void setUp() {
        p = new Pangram();
    }

    @Test
    void solution() {
        assertAll(
                () -> assertTrue(p.solution("TheQuickBrownFoxJumpsOverTheLazyDog")),
                () -> assertFalse(p.solution("This is not a pangram")),
                () -> assertTrue(p.solution("mnahHoHjIp2 IdlkvEwjBqrxYzcfGSt33U")),
                () -> assertFalse(p.solution("mnahHoHjIp2 IEwjBqrxYzcfGSt33U")),
                () -> assertFalse(p.solution("a"))
        );
    }
}