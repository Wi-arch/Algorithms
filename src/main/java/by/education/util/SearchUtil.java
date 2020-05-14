package by.education.util;

public class SearchUtil {

    public static int binarySearch(int[] ar, int key) {
        int low = 0;
        int high = ar.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            int midElement = ar[mid];
            if (key == midElement) {
                return mid;
            }
            if (midElement < key) {
                low = mid + 1;
            } else if (midElement > key) {
                high = mid;
            }
        }
        return -1;
    }

    public static int binarySearchRecursion(int[] ar, int key) {
        return binarySearch(ar, 0, ar.length - 1, key);
    }

    private static int binarySearch(int ar[], int low, int high, int key) {
        if (high >= low) {
            int mid = (high + low) / 2;
            if (ar[mid] == key) {
                return mid;
            }
            if (ar[mid] > key) {
                return binarySearch(ar, low, mid - 1, key);
            }
            return binarySearch(ar, mid + 1, high, key);
        }
        return -1;
    }
}
