package gr.aueb.cf.review;

import java.util.Scanner;

/**
 * Δοθέντος ενός String, μετατρέπει σε κεφαλαία-πεζά εναλλάξ
 * Παράδειγμα, αν έχουμε "He!llo World" -> "He!LlO wOrLd"
 */
public class UpperAndLowerCase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String phrase ;
        String result;

        System.out.println("Εισάγετε μία πρόταση");
        phrase = in.nextLine();

        result = lowerUpperCase(phrase);
        System.out.println(result);
    }

    public static String lowerUpperCase(String phrase) {
        StringBuilder sb = new StringBuilder(phrase.length());
        char ch ;

        for (int i = 0; i < phrase.length(); i++) {
            ch = phrase.charAt(i);
            if (Character.toUpperCase(ch) == ch) {
                ch = Character.toLowerCase(ch);
            } else if (Character.toLowerCase(ch) == ch) {
                ch = Character.toUpperCase(ch);
            }
            sb.append(ch);
        }
        return sb.toString();
    }

    public static String getLowerUpperCase(String phrase) {
        StringBuilder sb = new StringBuilder(phrase.length());
        char ch ;
        int letterIndex = 0;
        for (int i = 0; i < phrase.length(); i++) {
            ch = phrase.charAt(i);
            if (Character.isLetter(ch)) {
                ch = letterIndex % 2 == 0 ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
                letterIndex++;
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}
