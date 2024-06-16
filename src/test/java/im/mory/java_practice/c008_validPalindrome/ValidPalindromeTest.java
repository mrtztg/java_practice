package im.mory.java_practice.c008_validPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void solution() {
        final ValidPalindrome v = new ValidPalindrome();
        assertAll(
                () -> assertTrue(v.solution("A man, a plan, a canal, Panama!")),
                () -> assertTrue(v.solution("Was it a car or a cat I saw?")),
                () -> assertFalse(v.solution("Was it a car or a cat I sw?")),
                () -> assertFalse(v.solution("2wasa"))
        );
    }
}