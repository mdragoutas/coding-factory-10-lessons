package gr.aueb.cf.java.ch6;

/**
 * Arrays and Methods
 * Πως περνάμε έναν πίνακα ως τυπική παράμετρο
 * μιας μεθόδου και πως καλούμε μία μέθοδο περνώντας πίνακα
 * ως πραγματική παράμετρο
 */
public class ArraysAndMethods {

    public static void main(String[] args) {
        int[] arr1 = {10, 20 ,47, 19, 167, 230};

        printArray(arr1);

        printArray(arr1, 0, arr1.length);
    }

    /**
     * Prints the elements of an array
     * @param arr1      the input array
     */
    public static void printArray(int[] arr1){
        for (int item : arr1){
            System.out.print(item + " ");
        }
    }

    /**
     * Prints the elements of an array between two indices.
     * Low index is inclusive.
     * High index is exclusive.
     * @param arr1  the input array to print
     * @param low   the starting index (inclusive)
     * @param high  the ending index (exclusive)
     */
    public static void printArray(int[] arr1, int low, int high) {
        if (arr1 == null) return;
        if (low < 0 || high > arr1.length) return;
        if (low > high) return;

        for (int i = low; i < high ; i++) {
            System.out.print( arr1[i] + " ");
        }

    }
}
