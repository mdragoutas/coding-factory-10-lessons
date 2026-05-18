package gr.aueb.cf.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int num = 0;

        System.out.println("Εισάγετε έναν ακέραιο");

//        try {
//            num = in.nextInt();
//            System.out.println("Ο ακέραιος που εισάγετε είναι ο: " + num);
//        } catch (InputMismatchException e) {
//            System.err.println(e.getMessage());
//        } finally {
//            try {
//                if (in != null) in.close();
//            } catch (Exception e) {
//                System.out.println(e.getMessage());
//            }
        // try with resources
        try (Scanner in = new Scanner(System.in)) {
            num = in.nextInt();
            System.out.println("Ο ακέραιος είναι ο: " + num);
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }
}

