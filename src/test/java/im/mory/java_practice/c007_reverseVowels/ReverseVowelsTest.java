package im.mory.java_practice.c007_reverseVowels;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseVowelsTest {
    private ReverseVowels r;

    @BeforeEach
    void setUp() {
        r = new ReverseVowels();
    }

    @Test
    void solution() {
        assertAll(
                () -> assertEquals("holle", r.solution("hello")),
                () -> assertEquals("UOIEA", r.solution("AEIOU")),
                () -> assertEquals("DusUgnGires", r.solution("DesignGUrus"))
        );
    }
}