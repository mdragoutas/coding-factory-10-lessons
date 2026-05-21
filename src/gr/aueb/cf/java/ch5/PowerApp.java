package gr.aueb.cf.java.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει την δύναμη a^b με μέδοθο
 */
public class PowerApp {

    public static void main(String[] args) {

        //Declaration and initialization
        Scanner in = new Scanner(System.in);
        int base = 0;
        int exponent = 0;
        int result = 0;

        //User Input- Data binding
        System.out.println("Εισάγετε 2 ακεραίους:");
        base = in.nextInt();
        exponent = in.nextInt();

        //Calls the service of pow
        result = pow(base ,exponent);

        //Prints result
        System.out.printf("Το αποτέλεσμα του %d^%d είναι %d", base , exponent, result);
    }
    /**
     * Calculates the power a^b
     *
     * @param a     The base of the power
     * @param b     The exponent of the power
     * @return      The result of a^b
     */
    public static int pow(int a, int b) {

        //Declaration and initialization
        int result = 1;

        //Commands
        for (int i = 1; i <= b ; i++) {
            result *= a;
        }

        //Return result
        return result;
    }
}
