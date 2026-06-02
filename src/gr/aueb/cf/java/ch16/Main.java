package gr.aueb.cf.java.ch16;

public class Main {

    public static void main(String[] args) {
        Book pythonBook = new Book.Builder(1, "A123").build();
        Book javaBook = new Book.Builder(2, "B456")
                .author("Emmanouil")
                .title("Java Programming")
                .build();
        Book javascriptBook = new Book.Builder(3, "C789")
                .title("JavaScript")
                .build();
    }
}
