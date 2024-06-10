package im.mory.java_practice.c004_minRemoveValidParentheses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinRemoveValidParenthesesTest {
    private MinRemoveValidParentheses m;

    @BeforeEach
    void setUp() {
        m = new MinRemoveValidParentheses();
    }

    @Test
    void testSolution() {
        assertAll(
                () -> assertEquals("lee(t(c)o)de", "lee(t(c)o)de)"),
                () -> assertEquals("ab(c)d", "a)b(c)d"),
                () -> assertEquals("", "))((")
        );
    }
}