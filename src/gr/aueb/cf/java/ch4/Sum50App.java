package gr.aueb.cf.java.ch4;

/**
 * Βρίσκει και εκτυπώνει το άθροισμα των
 * ακεραίων απο το 1 έως το 50
 * Αναμενόμενο αποτέλεσμα 1275
 */
public class Sum50App {
    public static void main(String[] args) {
        int sum = 0;
        final int START = 1;
        final int END = 50;

        for (int i = START; i <= END ; i++) {
            sum+= i;
        }

        System.out.println("Sum from 1 to 50: " + sum);
    }
}
