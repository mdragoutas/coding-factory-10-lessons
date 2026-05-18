package gr.aueb.cf.ch6;

/**
 * Θέλουμε να βρούμε με τη χρήση μεθόδων πόσες φορές
 * υπάρχει μια τιμή μέσα σε έναν πίνακα
 */
public class ArrayCountApp {

    public static void main(String[] args) {
        int[] arr = {12, 15, 12, 0, 1, 7, 15, 12};
        int value = 12;
        int count = 0;

        count = getCount(arr, value);

        System.out.printf("Ο ακέραιος %d εμφανίζεται %d φορές στον πίνακα arr\n", value, count);

    }

    /**
     * Υπολογίζει τον αριθμό που εμφανίζεται ο ακέραιος value
     * μέσα στον πίνακα arr
     *
     * @param arr   the input array to search through
     * @param value the value to count in the array
     * @return      the count of occurrences of the value in the array
     *              or -1 if the array is null
     */
    public static int getCount(int[] arr, int value) {
        int count = 0;
        if(arr == null) return -1;

        for (int i = 0; i < arr.length; i++) {
               if (arr[i] == value){
                   count++;
               }
        }
        return count;
    }
}
