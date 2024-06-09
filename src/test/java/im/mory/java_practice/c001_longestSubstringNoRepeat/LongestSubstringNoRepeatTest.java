package im.mory.java_practice.c001_longestSubstringNoRepeat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringNoRepeatTest {

    private LongestSubstringNoRepeat algo;

    @BeforeEach
    void setUp() {
        algo = new LongestSubstringNoRepeat();
    }

    @Test
    @DisplayName("Test Solution")
    void solution() {
        assertAll(
                () -> assertEquals(3, algo.solution("abcabcbb")),
                () -> assertEquals(1, algo.solution("bbbbb")),
                () -> assertEquals(2, algo.solution("au")),
                () -> assertEquals(3, algo.solution("pwwkew")),
                () -> assertEquals(0, algo.solution("")),
                () -> assertEquals(3, algo.solution("dvdf"))
        );
    }
}