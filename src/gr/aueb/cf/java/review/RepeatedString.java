package gr.aueb.cf.java.review;

/**
 * Δοθέντος ενός String, επιστρέφει ένα string
 * που αποτελεί επανάληψη του αρχικού string, n φορές
 * Για παράδειγμα, αν το αρχικό String είναι το abc και το
 * n = 3, τότε επιστρέφει abcabcabc.
 */
public class RepeatedString {

    public static void main(String[] args) {
        String phrase = "abc";
        int n = 3;

        String result = getRepeatedString(phrase, n);
        System.out.println(result);
    }

    public static String getRepeatedString(String phrase, int n) {
        if (phrase == null) {
            throw new IllegalArgumentException("String cannot be null");
        }
        if (n < 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        return result.repeat(phrase, n).toString();
    }
}
