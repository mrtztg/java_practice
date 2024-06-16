package im.mory.java_practice.c009_validAnagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {

    @Test
    void solution() {
        final var v = new ValidAnagram();
        assertTrue(v.solution("listen", "silent"));
        assertFalse(v.solution("rat", "car"));
        assertFalse(v.solution("hello", "world"));
        assertTrue(v.solution("anagram", "nagaram"));
    }
}