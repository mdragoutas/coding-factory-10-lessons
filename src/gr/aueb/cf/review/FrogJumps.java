package gr.aueb.cf.review;

/**
 * Από ένα σημείο χ, φτάνει ή ξεπερνάει σημείο y όπου κάθε
 * jump έχει μήκος jmp
 */
public class FrogJumps {

    public static void main(String[] args) {

    }

    public static int frogJumps(int start, int end, int jmp) {
        int frogPosition = start;
        int countOfJumps = 0;

        while (frogPosition < end) {
            countOfJumps++;
            frogPosition += jmp;
        }
        return countOfJumps;
    }

    // Πιο αποδοτικός τρόπος
    public static int frogJumps2(int start, int end, int jmp) {
        return (int) Math.ceil((double)(end - start) / jmp);
    }
}
