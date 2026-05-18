package gr.aueb.cf.review;

/**
 * Θέλουμε να μετακινήσουμε όλα τα στοιχεία ενός πίνακα προς τα δεξιά ή προς τα αριστερά
 * με κυκλική μετατόπιση
 */
public class ArrayCircularRotation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int offset = 1;

        int[] rightRotatedArr = shiftRightBy(arr, offset);
        int[] leftRotatedArr = shiftLeftBy(arr, offset);

        for (int el : rightRotatedArr) {
            System.out.print(el + " ");
        }

        System.out.println();

        for (int el : leftRotatedArr) {
            System.out.print(el + " ");
        }
    }

    public static int[] shiftRightBy(int[] arr, int offset) {
        if (arr == null || arr.length == 0) return new int[0];
        if (offset < 0) return new int[0];
        int[] rotatedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotatedArr[(i + offset) % arr.length] = arr[i];
        }
        return rotatedArr;
    }

    public static int[] shiftLeftBy(int[] arr, int offset) {
        if (arr == null || arr.length == 0) return new int[0];
        if (offset < 0) return new int[0];
        int[] rotatedArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotatedArr[i] = arr[(i + offset) % arr.length];
        }
        return rotatedArr;
    }
}
