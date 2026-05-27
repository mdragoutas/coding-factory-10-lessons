package gr.aueb.cf.java.ch15.abstract_classes;

public class Cat extends Animal {

    @Override
    public void eat() {
        super.eat();
        System.out.println("The cat is eating...");
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }
}
