package by.education.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchUtilTest {

    private static final int[] SORTED_ARRAY = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    @Test
    void testBinarySearch() {
        int expected = 2;
        int actual = SearchUtil.binarySearch(SORTED_ARRAY, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testBinarySearchRecursion() {
        int expected = 9;
        int actual = SearchUtil.binarySearchRecursion(SORTED_ARRAY, 9);
        assertEquals(expected, actual);
    }
}