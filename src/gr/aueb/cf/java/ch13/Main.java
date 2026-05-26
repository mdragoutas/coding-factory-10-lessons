package gr.aueb.cf.java.ch13;

public class Main {

    public static void main(String[] args) {

        // Use of Singleton
        OnlyOneCodingFactory onlyOneCodingFactory = OnlyOneCodingFactory.getInstance();
        onlyOneCodingFactory.doSomething();

        // Καλούμε την υπηρεσία της Utility Class
        HelloUtil.sayHello();
    }
}
