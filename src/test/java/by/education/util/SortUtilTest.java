package by.education.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static by.education.util.SortUtil.mergeSort;
import static by.education.util.SortUtil.quickSort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortUtilTest {

    private static final int[] UNSORTED_ARRAY = {8, 7, 9, 3, 1, 2, 4, 5, 6};
    private static final int[] SORTED_ARRAY = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static final Random RANDOM = new Random();

    @BeforeEach
    public void init() {
        shuffleArray(UNSORTED_ARRAY);
    }

    @Test
    void testQuickSort() {
        quickSort(UNSORTED_ARRAY);
        assertArrayEquals(UNSORTED_ARRAY, SORTED_ARRAY);
    }

    @Test
    void testMergeSort() {
        assertArrayEquals(mergeSort(UNSORTED_ARRAY), SORTED_ARRAY);
    }

    private void shuffleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            swap(array, i, RANDOM.nextInt(array.length));
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}