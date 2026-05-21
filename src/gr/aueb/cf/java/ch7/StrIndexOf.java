package gr.aueb.cf.java.ch7;

public class StrIndexOf {

    public static void main(String[] args) {
        String s = "Coding Factory";

        int positionOfo = s.indexOf('o');           // 1
        int positionOfLasto = s.lastIndexOf('o');   // 11

    }

    public static String getExtension(String filename) {
        return filename.substring(filename.indexOf("." + 1));
    }
}
