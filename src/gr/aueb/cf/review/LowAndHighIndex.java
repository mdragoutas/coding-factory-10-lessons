package gr.aueb.cf.review;

/**
 * Έστω ένας πίνακας {1, 2, 4, 4, 4, 6, 7, 8, 8, 8, 12, 12}
 * Να επιστρέφει το low & high index για ένα key
 * Αν το key είναι το 8, τότε πρέπει να επιστρέψει {7, 9} ή
 * {8, 10} για τον χρήστη
 */
public class LowAndHighIndex {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 6, 7, 8, 8, 8, 12, 12};
        int key = 8;

        int[] lowAndHighIndices = getLowAndHighIndex(arr, key);

        for (int el : lowAndHighIndices) System.out.println(el + " ");
    }

    public static int[] getLowAndHighIndex(int[] arr, int key){
        int keyLowIndex = 0;
        int keyHighIndex = 0;
        int pivot = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                keyLowIndex = i;
                break;
            }
        }
        keyHighIndex = keyLowIndex;
        pivot = keyLowIndex + 1;

        while (pivot < arr.length && arr[pivot++] == key) keyHighIndex++;

        return new int[] {keyLowIndex + 1, keyHighIndex + 1};
    }
}
