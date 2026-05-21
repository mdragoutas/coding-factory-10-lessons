package gr.aueb.cf.java.ch6;

import java.util.Arrays;

/**
 * Οι βασικές πράξεις σε συλλογές όπως οι πίνακες είναι:
 * filtering
 * mapping
 * reducing
 */
public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2 , 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayFiltered = new int[arr.length];
        int[] arrayMapped = new int[arr.length];
        int sum = 0;

        arrayFiltered = filterEven(arr);
        arrayMapped = mapToDouble(arr);

        sum = sum(arr);

        System.out.println("arr only with evens");
    }

    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] arrayToReturn = new int[arr.length];
        int newLength = 0;

        for (int element : arr){
            if (element % 2 == 0) {
                arrayToReturn[newLength++] = element;
            }
        }
        return Arrays.copyOf(arrayToReturn, newLength);
    }

    /**
     * Πολλαπλασιάζει όλα τα στοιχεία του πίνακα arr με τον ακέραιο 2
     * @param arr   the input array
     * @return      the array with its elements multiplied by 2
     */
    public static int[] mapToDouble(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        int[] mappedArray = new int[arr.length];

        for(int i = 0 ; i < arr.length; i++){
            mappedArray[i] = arr[i] * 2;
        }
        return Arrays.copyOf(mappedArray, arr.length);
    }

    /**
     * Υπολογίζει το άθροισμα όλων των στοιχείων του πίνακα arr
     * @param arr   the input array
     * @return      the sum of arr's elements
     */
    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        int sum = 0;

        for (int element : arr) {
            sum += element;
        }
        return sum;
    }

    /**
     * Υπολογίζει τον μέσο όρο των στοιχείων του πίνακα arr
     * @param arr   the input array
     * @return      the average of arr's elements
     */
    public static double avg(int[] arr) {
        if (arr == null || arr.length == 0) return 0;
        return sum(arr) / (double) arr.length;
    }

    /**
     * Εκτυπώνει τα στοιχεία ενός πίνακα
     * @param arr   the array to print
     */
    public static void printArray(int[] arr) {
        for (int item : arr){
            System.out.print(item + " ");
        }
    }

    /**
     * Υπολογίζει αν υπάρχει τουλάχιστον ένας άρτιος από
     * τα στοιχεία του πίνακα arr
     * @param arr       the input array
     * @return          if there is at least one even integer
     */
    public static boolean isAnyEven(int[]arr) {
        if (arr == null || arr.length == 0) return false;
        boolean isEven = false;
        for (int element : arr) {
            if (element % 2 == 0) {
                isEven = true;
                break;
            }
        }
        return isEven;
    }

    /**
     * Υπολογίζει αν όλα τα στοιχεία του πίνακα arr είναι άρτιοι
     * @param arr       the input array
     * @return          if all arr's elements are even
     */
    public static boolean areAllEven(int[]arr) {
        if (arr == null || arr.length == 0) return false;
        boolean areEven = true;

        for (int element : arr) {
            if (element % 2 != 0){
                areEven = false;
                break;
            }
        }
        return areEven;
    }

    public static boolean isMoreThanTwoEven(int[] arr) {
        if (arr == null || arr.length == 0) return false;
//        int evenCount = 0;
//        boolean areManyEven = false;
//
//        for (int element : arr) {
//            if (element % 2 == 0) {
//                evenCount++;
//            }
//            if (evenCount >= 2) {
//                areManyEven = true;
//                break;
//            }
//        }
//        return areManyEven;
        int[] filteredArray;
        filteredArray = filterEven(arr);

        return filteredArray.length > 2;
    }
}
