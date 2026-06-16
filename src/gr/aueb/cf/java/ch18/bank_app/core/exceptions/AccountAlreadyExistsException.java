package gr.aueb.cf.java.ch18.bank_app.core.exceptions;

public class AccountAlreadyExistsException extends Exception {

    public AccountAlreadyExistsException(String message) {
        super(message);
    }
}
