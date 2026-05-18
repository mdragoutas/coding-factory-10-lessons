package gr.aueb.cf.ch7;

/**
 *
 */
public class LetterCount {

    public static void main(String[] args) {

    }

    public static int getCount(String phrase, char letter) {
        if (phrase == null || phrase.isEmpty()) return -1;
        int letterCount = 0;

        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == letter ) letterCount++;
        }
        return letterCount;
    }
}
