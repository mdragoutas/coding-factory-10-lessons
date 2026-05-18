package gr.aueb.cf.ch8;

/**
 * NullPointerException the most popular exception {@link NullPointerException}
 */
public class NPEApp {

    public static void main(String[] args) {
        String s;

        s = getOneOrNull();

        if (s == null) {
            System.out.println("s is null");
        } else {
            System.out.println(s.length());
        }
    }

    public static String getOneOrNull() {
        return null;
    }
}
