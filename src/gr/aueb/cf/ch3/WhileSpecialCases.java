package gr.aueb.cf.ch3;

/**
 * Special Cases of While
 * 1) Zero iterations
 * 2) One iteration
 * 3) Eternal loop
 */
public class WhileSpecialCases {
    public static void main(String[] args) {
        int i = 1;

        //1)
        while (i<=0){
            System.out.println("i = " + i);
            i++;
        }

        //2)
        while (i<=1){
            System.out.println("i = " + i);
            i++;
        }

        //3)
        while (true) {
            System.out.println("Eternal loop");
        }
    }
}
