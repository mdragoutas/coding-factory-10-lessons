package gr.aueb.cf.java.ch7;

/**
 * Το s1 δείχνει σε νέα τιμή στο Heap ενώ το 'παλιό String'
 * μένει χωρίς αναφορά (reference) και γίνεται garbage collected
 *
 * Επομένως τα Strings είναι immutable
 */
public class ImmutableApp {

    public static void main(String[] args) {
        String s1 = "Coding Factory";

        s1 = "Coding Plus";
    }
}
