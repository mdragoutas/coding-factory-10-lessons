package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει, χρησιμοποιώντας την εντολή for,από 1-10 κι από 10-1 αστεράκια
 * κάθετα, οριζόντια και 10 x 10 αστεράκια
 */
public class StarsForApp {
    public static void main(String[] args) {
        final int DESIRED_NUMBER = 10;

        //10 οριζόντια
        for (int i = 1; i <= DESIRED_NUMBER ; i++) {
            System.out.print("*");
        }

        //10 κάθετα
        for (int i = 1; i <= DESIRED_NUMBER ; i++) {
            System.out.println("*");
        }

        //10 χ 10
        for (int i = 1; i <= DESIRED_NUMBER ; i++) {

            for (int j = 1; j <= DESIRED_NUMBER; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //1-10

        for ( int i = 1; i <= DESIRED_NUMBER; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //10-1

        for (int i = 1; i <= DESIRED_NUMBER ; i++) {
            for ( int j = DESIRED_NUMBER; j >= i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
