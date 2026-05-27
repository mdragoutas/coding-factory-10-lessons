package gr.aueb.cf.java.ch14.bankapp;

public class InsufficientBalanceException extends Exception{

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
