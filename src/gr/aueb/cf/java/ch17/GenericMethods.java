package gr.aueb.cf.java.ch17;

public class GenericMethods {

    public static void main(String[] args) {
        String[] strArray = {"a", "b", "c"};
        printArray(strArray);

        Integer[] intArray = {1, 2, 3};
        printArray(intArray);

        Boolean[] boolArray = {true, false};
        printArray(boolArray);


    }

    public static <T> void printArray(T[] arr) {
        for (T  element : arr) {
            System.out.print(element);
        }
        System.out.println();
    }

    public static void print(GenericNode<?> node) {
        System.out.println(node.getValue());
    }

    public static void printNumber(GenericNode<? extends Number> node) {
        System.out.println(node.getValue());
    }

    public static void printNumberAgain(GenericNode<? super Number> node) {
        System.out.println(node.getValue());
    }
}
