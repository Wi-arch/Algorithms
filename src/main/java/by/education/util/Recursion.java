package by.education.util;

import java.util.Arrays;

public class Recursion {

    public static int getFactorial(int n) {
        if (n == 1) {
            return 1;
        }
        return getFactorial(n - 1) * n;
    }

    public static int getSumOfAllElements(int ar[]) {
        if (ar.length == 0) {
            return 0;
        }
        return ar[0] + getSumOfAllElements(Arrays.copyOfRange(ar, 1, ar.length));
    }

    public static int findMaxElement(int[] ar) {
        return findMaxElement(ar, Integer.MIN_VALUE);
    }

    private static int findMaxElement(int[] ar, int maxValue) {
        if (ar.length == 0) {
            return maxValue;
        }
        return findMaxElement(Arrays.copyOfRange(ar, 1, ar.length), Math.max(maxValue, ar[0]));
    }
}
