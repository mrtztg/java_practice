package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch011HappyNumberTest {

    @Test
    void find() {
        Ch011HappyNumber c = new Ch011HappyNumber();
        assertTrue(c.find(23));
        assertFalse(c.find(12));
    }
}