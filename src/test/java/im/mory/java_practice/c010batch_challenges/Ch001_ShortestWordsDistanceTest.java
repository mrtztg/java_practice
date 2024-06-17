package im.mory.java_practice.c010batch_challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ch001_ShortestWordsDistanceTest {

    @Test
    void solution() {
        Ch001_ShortestWordsDistance s = new Ch001_ShortestWordsDistance();
        assertEquals(5, s.solution(new String[]{"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"},
                "fox", "dog"));
        assertEquals(1, s.solution(new String[]{"a", "c", "d", "b", "a"}, "a", "b"));
        assertEquals(4, s.solution(new String[]{"a", "b", "c", "d", "e"}, "a", "e"));
    }
}