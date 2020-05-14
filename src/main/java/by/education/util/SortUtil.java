package by.education.util;

import java.util.Arrays;

public class SortUtil {

    public static int[] mergeSort(int[] ar) {
        int length = ar.length;
        if (length < 2) {
            return ar;
        }
        return merge(mergeSort(Arrays.copyOfRange(ar, 0, length / 2)), mergeSort(Arrays.copyOfRange(ar, length / 2, length)));
    }

    public static void quickSort(int ar[]) {
        quickSort(ar, 0, ar.length - 1);
    }

    private static int[] merge(int ar1[], int ar2[]) {
        int[] result = new int[ar1.length + ar2.length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < result.length; i++) {
            if (a < ar1.length && b < ar2.length) {
                result[i] = ar1[a] < ar2[b] ? ar1[a++] : ar2[b++];
            } else {
                result[i] = a < ar1.length ? ar1[a++] : ar2[b++];
            }
        }
        return result;
    }

    private static void quickSort(int ar[], int start, int end) {
        int i = start;
        int j = end;
        int mid = (start + end) / 2;
        while (i < end && ar[i] < ar[mid]) {
            i++;
        }
        while (j > start && ar[j] > ar[mid]) {
            j--;
        }
        if (i <= j) {
            int t = ar[i];
            ar[i++] = ar[j];
            ar[j--] = t;
        }
        if (i < end) {
            quickSort(ar, i, end);
        }
        if (start < j) {
            quickSort(ar, start, j);
        }
    }
}
