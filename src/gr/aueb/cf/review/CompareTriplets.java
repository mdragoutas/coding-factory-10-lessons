package gr.aueb.cf.review;

/**
 * Δίνονται ως είσοδος 2 πίνακες - ένας για την Alice και ένας για τον Bob -
 * που περιέχουν 3 βαθμολογίες ο καθένας σε 3 μαθήματα (Μουσική, Μαθηματικά, Φυσική)
 * Κάθε βαθμός μπορεί να είναι από 1 - 100
 *
 * Αν η Alice έχει μεγαλύτερη βαθμολογία σε ένα μάθημα, παίρνει 1 πόντο
 * Αν ο Bob έχει μεγαλύτερη βαθμολογία σε ένα μάθημα, παίρνει αυτός τον πόντο
 * Αν η βαθμολογία τους σε ένα μάθημα είναι ίση, κανείς δεν παίρνει πόντο
 *
 * Επιστρέφει πίνακα με 2 θέσεις [πόντοι Alice, πόντοι Bob]
 */
public class CompareTriplets {
    static int students = 2;

    public static void main(String[] args) throws Exception {
        int[] aliceGrades = {75, 95, 67};
        int[] bobGrades = {10, 70, 90};

        int[] scoreboard = getScoreboard(aliceGrades, bobGrades);

        System.out.printf("Points\nAlice: %d\nBob: %d", scoreboard[0], scoreboard[1]);
    }

    public static int[] getScoreboard(int[] aliceGrades, int[] bobGrades) {
        int[] scoreboard = new int[students];
        int alicePoints = 0;
        int bobPoints = 0;

        for (int i = 0; i < aliceGrades.length; i++) {
            if (aliceGrades[i] == bobGrades[i]) continue;
            if (aliceGrades[i] > bobGrades[i]) alicePoints++;
            else bobPoints++;
        }
        scoreboard[0] = alicePoints;
        scoreboard[1] = bobPoints;

        return scoreboard;
    }
}
