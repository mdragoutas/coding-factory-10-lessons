package gr.aueb.cf.java.ch6;

/**
 * Array Init & Populate
 */
public class ArrayInit {

    public static void main(String[] args) {
        int[] arr1 = new int[5];    //Default values: 0
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};    // Unsized Initialization
        int[] arr3 = new int[] { 1, 2, 3, 4, 5, 6, 7, 66, 49, 100}; // Array initializer
        // Populate the array
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        System.out.println("arr1[0] = " + arr1[0]);
        System.out.println("arr1[1] = " + arr1[1]);
        System.out.println("arr1.length = " + arr1.length);
    }
}
