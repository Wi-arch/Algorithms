package by.education.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecursionTest {

    private static final int[] VALID_ARRAY = {4, 3, 5, 2, 1};

    @Test
    void testGetFactorial() {
        int expected = 120;
        int actual = Recursion.getFactorial(5);
        assertEquals(expected, actual);
    }

    @Test
    void testGetSumOfAllElements() {
        int expected = 15;
        int actual = Recursion.getSumOfAllElements(VALID_ARRAY);
        assertEquals(expected, actual);
    }

    @Test
    void testFindMaxElement() {
        int expected = 5;
        int actual = Recursion.findMaxElement(VALID_ARRAY);
        assertEquals(expected, actual);
    }
}