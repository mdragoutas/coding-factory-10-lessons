package gr.aueb.cf.java.ch6;

/**
 * Διαβάζεται το ίδιο από την αρχή προς το τέλος
 * και από το τέλος προς την αρχή
 *
 * {1, 2, 3, 3, 2, 1} συμμετρικός πίνακας
 * {1, 2, 3, 2, 1}
 */
public class ArraySymmetric {

    public static void main(String[] args) {

    }

    /**
     * Επιστρέφει true αν ο πίνακας είναι συμμετρικός
     * αλλιώς false
     * @param arr   the input array
     * @return      if the array is symmetrical returns true
     *              if not returns false
     */
    public static boolean isSymmetric(int[] arr) {
        if (arr == null) return false;

        for (int i = 0, j = arr.length - 1; i < j ; i++, j--) {
            if (arr[i] != arr[j]) return false;
        }
        return true;
    }
}
