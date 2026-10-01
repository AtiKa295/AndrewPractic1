package Practic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversLettersTest {
    @Test
    void testStandartCase() {
        assertEquals("J@va the be$t!123", ReversLetters.reversLetters("t@eb eht av$J!123"));
    }

    @Test
    void returnsEmptyForEmptyInput() {
        assertEquals("", ReversLetters.reversLetters(""));
    }

    @Test
    void testSingleLetter() {
        assertEquals("a", ReversLetters.reversLetters("a"));
    }

    @Test
    void testWithoutLetters() {
        assertEquals("123 !@#", ReversLetters.reversLetters("123 !@#"));
    }

    @Test
    void reversesOnlyLetters() {
        assertEquals("abcd", ReversLetters.reversLetters("dcba"));
    }

    @Test
    void keepsNonLettersInPlace() {
        assertEquals("!cba?", ReversLetters.reversLetters("!abc?"));
    }

    @Test
    void testCasePreservation() {
        assertEquals("A", ReversLetters.reversLetters("A"));
    }
}