package gr.aueb.cf.java.review;

import java.util.Scanner;

/**
 * Ένας αριθμός Armstrong είναι ένας ακέραιος αριθμός
 * που είναι ίσος με το άθροισμα των ψηφίων όπου το κάθε ψηφίο
 * έχει υψωθεί στη δύναμη του αριθμού των ψηφίων
 * Για παράδειγμα 153 = 1^3 + 5^3 + 3^3
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Εισάγετε έναν ακέραιο αριθμό:");
        num = in.nextInt();

        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int num) {
        int numberOfDigits = 0;
        int tmp = 0;
        int digit = 0;
        int sum = 0;
        tmp = num;

        // Πρώτα βρίσκουμε το πλήθος των ψηφίων με διαδοχικές διαιρέσεις με το 10
        while (tmp != 0) {
            numberOfDigits++;
            tmp /= 10;
        }

        tmp = num;

        // Βρίσκουμε το κάθε ψηφίο με mod 10 και προσθέτουμε το ψηφίο
        // στο sum υψωμένο στην δύναμη του πλήθους των ψηφίων
        while (tmp != 0) {
            digit = tmp % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            tmp /= 10;
        }
        return sum == num;
    }
}
