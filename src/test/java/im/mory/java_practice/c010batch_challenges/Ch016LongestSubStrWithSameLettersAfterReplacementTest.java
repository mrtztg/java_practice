package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch016LongestSubStrWithSameLettersAfterReplacementTest {

    @Test
    void findLength() {
        Ch016LongestSubStrWithSameLettersAfterReplacement c = new Ch016LongestSubStrWithSameLettersAfterReplacement();
        assertEquals(5, c.findLength("aabccbb", 2));
        assertEquals(4, c.findLength("abbcb", 1));
        assertEquals(3, c.findLength("abccde", 1));
        assertEquals(5, c.findLength("bjbcbjcaja", 2));
    }
}