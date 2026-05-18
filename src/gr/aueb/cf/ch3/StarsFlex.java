package gr.aueb.cf.ch3;
import java.util.Scanner;
/**
 * Ο χρήστης εισάγει έναν θετικό ακέραιο n
 * και το πρόγραμμα εκτυπώνει τόσα οριζόντια αστεράκια
 * όσα κι ο αριθμός n που εισάγει
 */
public class StarsFlex {
    public static void main(String[] args) {

        int i = 1;
        int n = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Είσαγετε έναν θετικό ακέραιο");
        n = scanner.nextInt();

        while (i <= n) {
            System.out.print("*");
            i++;
        }
    }
}
