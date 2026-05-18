package gr.aueb.cf.ch7;

import java.util.Scanner;

/**
 * Δέχεται Strings από τον χρήστη και είτε τα κρυπτογραφεί ή τα
 * αποκρυπτογραφεί. Στην κρυπτογράφηση αντικαθιστά κάθε χαρακτήρα με
 * τον λεξικογραφικά επόμενο (πχ το Ζ γίνεται Α) και μετά επιστρέφει το
 * κρυπτογραφημένο μήνυμα. Στην αποκρυπτογράφηση κάνει το ίδιο αλλά αντικαθιστά τον
 * λεξικογραφικά προηγούμενο χαρακτήρα (πχ το Β γίνεται Α) και μετά πάλι επιστρέφει
 * το αποκρυπτογραφημένο μήνυμα
 */
public class EncryptionApp {
    static Scanner in = new Scanner(System.in);
    static final int EXIT = 3;

    public static void main(String[] args) {
        String s ;
        int choice = 0;
        String result = "";

        while (true) {
            printMenu();
            choice = in.nextInt();
            in.nextLine();

            if (choice == EXIT) {
                System.out.println("Έξοδος...");
                break;
            }
            if (!isChoiceValid(choice)) {
                System.out.println("Μη έγκυρη επιλογή. Προσπαθήστε ξανά");
                continue;
            }
            System.out.println("Εισάγετε ένα μήνυμα με λατινικούς χαρακτήρες:");

            s = in.nextLine();
            result = getResultOnChoice(s, choice);

            System.out.println("Το καινούριο μήνυμα είναι: " + result);
            System.out.println();
        }
    }

    /**
     * Δέχεται ένα String και αντικαθιστά τους χαρακτήρες του
     * με τους επόμενους λεξικογραφικά τους. Στην περίπτωση του 'Ζ' και 'ζ'
     * επιστρέφει 'Α' και 'α' αντίστοιχα. Τέλος, επιστρέφει καινούριο String
     * με τους καινούριους χαρακτήρες
     * @param s     Το String που κρυπτογραφείται
     * @return      Το κρυπτογραφημένο String
     */
    public static String getEncryptedMessage(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == 'Z') sb.append('A');
            else if (letter == 'z') sb.append('a');
            else if (Character.isLetter(letter)) sb.append((char)(letter + 1));
        }
        return sb.toString();
    }

    /**
     * Δέχεται ένα String και αντικαθιστά τους χαρακτήρες του
     * με τους προηγούμενους λεξικογραφικά τους. Στην περίπτωση του 'Α' και 'α'
     * επιστρέφει 'Ζ' και 'ζ' αντίστοιχα. Τέλος, επιστρέφει καινούριο String
     * με τους καινούριους χαρακτήρες
     * @param s     Το String που αποκρυπτογραφείται
     * @return      Το αποκρυπτογραφημένο String
     */
    public static String getDecryptedMessage(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            if (letter == 'A') sb.append('Z');
            else if (letter == 'a') sb.append('z');
            else if (Character.isLetter(letter)) sb.append((char)(letter - 1));
        }
        return sb.toString();
    }

    /**
     * Εκτυπώνει ένα menu για τις επιλογές του χρήστη
     */
    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Κρυπτογράφηση");
        System.out.println("2. Αποκρυπτογράφηση");
        System.out.println("3. Έξοδος");
    }

    /**
     * Επιστρέφει το αποτέλεσμα σε String ανάλογα την επιλογή του χρήστη
     * @param s         Το String που δίνει ο χρήστης
     * @param choice    Η επιλογή του χρήστη (κρυπτογράφηση, αποκρυπτογράφηση και έξοδος)
     * @return          Το αποτέλεσμα των υπολογισμών σε String
     */
    public static String getResultOnChoice(String s, int choice) {
        return switch (choice) {
            case 1 -> getEncryptedMessage(s);
            case 2 -> getDecryptedMessage(s);
            default -> "Μη έγκυρη επιλογή";
        };
    }

    /**
     * Ελέγχει αν η επιλογή του χρήστη είναι έγκυρη
     * @param choice    Η επιλογή του χρήστη
     * @return          True αν είναι έγκυρη
     *                  False όταν δεν είναι έγκυρη
     */
    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= EXIT;
    }
}
