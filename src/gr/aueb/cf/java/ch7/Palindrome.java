package gr.aueb.cf.java.ch7;

/**
 * Παλινδρομική είναι μία πρόταση ένα String που διαβάζεται
 * το ίδιο από την αρχή και το τέλος
 */
public class Palindrome {

    public static void main(String[] args) {



    }

    public static boolean isPalindrome(String s) {

        for (int i = 0, j = s.length() - 1; i < j ; i++ , j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }

        return true;
    }

    public static boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder();
        String reversed = sb
                .reverse()
                .toString();

        return s.equals(reversed);
    }

    public static boolean isPalindrome3(String s) {
        return new StringBuilder(s)
                .reverse()
                .toString()
                .equals(s);
    }
}
