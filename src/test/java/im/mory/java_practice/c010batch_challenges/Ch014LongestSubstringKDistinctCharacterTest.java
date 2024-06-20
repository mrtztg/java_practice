package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch014LongestSubstringKDistinctCharacterTest {

    @Test
    void findLength() {
        Ch014LongestSubstringKDistinctCharacter c = new Ch014LongestSubstringKDistinctCharacter();
        assertEquals(4, c.findLength("araaci", 2));
        assertEquals(2, c.findLength("araaci", 1));
        assertEquals(5, c.findLength("cbbebi", 3));
    }
}