package im.mory.java_practice.c004_minRemoveValidParentheses;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

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
                () -> {
                    String solution = m.solution("lee(t(c)o)de)");
                    var expectedValues = List.of("lee(t(c)o)de", "lee(t(c)ode)");
                    assertTrue(expectedValues.contains(solution), "Expected values=" + String.join(",", expectedValues) + ", Actual value=" + solution);
                },
                () -> assertEquals("ab(c)d", m.solution("a)b(c)d")),
                () -> assertEquals("", m.solution("))((")),
                () -> assertEquals("(())", m.solution("))(())((")),
                () -> assertEquals("(())", m.solution("))(())))")),
                () -> assertEquals("aaaaaaa", m.solution("aaaaaa)a")),
                () -> assertEquals("aaa(aaa)a", m.solution("aaa((aaa)a")),
                () -> assertEquals("aaaaaaa", m.solution("aaa(aaaa"))
        );
    }
}