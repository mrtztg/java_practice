package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch015FruitsIntoBasketsTest {

    @Test
    void findLength() {
        Ch015FruitsIntoBaskets c = new Ch015FruitsIntoBaskets();
        assertEquals(3, c.findLength(new char[]{'A', 'B', 'C', 'A', 'C'}));
        assertEquals(5, c.findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}));
    }
}