package gr.aueb.cf.java.ch6;

/**
 * In binary search the array should be ordered
 */
public class BinarySearch {

    public static void main(String[] args) {

    }

    public static int binarySearch(int[] arr,int low, int high, int value) {
        if (arr == null) return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == value) return mid;
        if (arr[mid] < value) return binarySearch(arr, low, mid + 1, value);
        else return binarySearch(arr, low, mid - 1, value);

    }
}
