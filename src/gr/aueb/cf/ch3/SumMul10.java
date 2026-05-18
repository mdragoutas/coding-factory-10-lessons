package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το άθροισμα και το
 * γινόμενο των αριθμών από το 1 έως το 10
 */
public class SumMul10 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;

        int j = 1;
        int mul = 1;

        while (i <=10) {
            sum += i;
            i++;
        }
        while (j <= 10){
            mul *= j;
            j++;
        }
        System.out.println("Sum : " + sum);
        System.out.println("Mul : " + mul);
    }
}
