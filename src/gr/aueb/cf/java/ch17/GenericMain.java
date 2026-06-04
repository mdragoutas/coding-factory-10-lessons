package gr.aueb.cf.java.ch17;

public class GenericMain {

    public static void main(String[] args) {
        GenericNode<String> strNode = new GenericNode<>();
        GenericNode<Double> doubleNode = new GenericNode<>();

        var intNode = new GenericNode<Integer>();

        strNode.setValue("Coding");
        doubleNode.setValue(3.14);
        intNode.setValue(42);

        String str = strNode.getValue();
        double d = doubleNode.getValue();
        int i = intNode.getValue();
    }
}
