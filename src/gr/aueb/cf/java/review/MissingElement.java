package gr.aueb.cf.java.review;

public class MissingElement {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 7};
        int[] arr2 = {1, 4, 3, 2, 6};
        int missingElement = 0;

    }

    public static int findMissingElement(int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int num = 0;

        num = arr.length;
        expectedSum = (num + 1) * (num + 2) / 2;

        for (int element : arr) {
            actualSum += element;
        }
        return expectedSum - actualSum;
    }
}
