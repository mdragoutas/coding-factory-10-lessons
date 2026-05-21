package gr.aueb.cf.java.ch6;

/**
 * Βρίσκει τη θέση του μεγίστου στοιχείο του πίνακα arr
 */
public class ArrayMax {

    public static void main(String[] args) {
        int[] arr = {1, 15, 100, 2, 4, 1000, 5};
        int low = 2;
        int high = 5;


        int maxPosition = getMaxPosition(arr, low, high);

        if (maxPosition == -1) System.out.println("Δεν είναι σωστά τα όρια");
        else System.out.printf("Max value: %d στην θέση %d", arr[maxPosition] , maxPosition + 1 );
    }

    /**
     * Βρίσκει την θέση του μεγίστου στοιχείου του πίνακα arr
     * @param arr   Ο πίνακας που εξετάζουμε
     * @param low   Το κατώτατο όριο τιμής του δείκτη του πίνακα (inclusive)
     * @param high  Το ανώτατο όριο τιμής του δείκτη του πίνακα (exclusive)
     * @return      την θέση που βρίσκεται το μέγιστο στοιχείο
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        if (low > high || high < 0 || high >= arr.length) return -1;

        int maxPosition = low;
        int maxValue = arr[maxPosition];

        for (int i = low; i < high; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
