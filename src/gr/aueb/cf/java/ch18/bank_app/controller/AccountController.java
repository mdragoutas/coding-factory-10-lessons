package gr.aueb.cf.java.ch18.bank_app.controller;

import gr.aueb.cf.java.ch18.bank_app.core.exceptions.ValidationException;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountInsertDTO;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountReadOnlyDTO;
import gr.aueb.cf.java.ch18.bank_app.model.Account;
import gr.aueb.cf.java.ch18.bank_app.service.IAccountService;
import gr.aueb.cf.java.ch18.bank_app.validation.Validator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountController {
    private final IAccountService accountService;

    public AccountController(IAccountService accountService) throws ValidationException {
        this.accountService = accountService;
    }

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance) {
        // Data binding
        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);
        AccountReadOnlyDTO readOnlyDTO;

        // 1. Validation
        Map<String, String> errors = Validator.validateInsertDTO(insertDTO);
        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }
        // 2. Service Call
         readOnlyDTO = accountService.createNewAccount(insertDTO);

        // Dummy Data
//        readOnlyDTO = new AccountReadOnlyDTO(iban, balance);
        return readOnlyDTO;
    }

    public List<AccountReadOnlyDTO> getAllAccounts() {

        // Dummy Data
        return List.of(new AccountReadOnlyDTO("GR12345", BigDecimal.valueOf(1000)),
                new AccountReadOnlyDTO("GR12346", BigDecimal.valueOf(2000)),
                new AccountReadOnlyDTO("GR12347", BigDecimal.valueOf(3000)),
                new AccountReadOnlyDTO("GR12348", BigDecimal.valueOf(4000))
        );

        // Service Call
        //return accountService.getAllAccounts();
    }

    public void deposit(String iban, BigDecimal amount) {

        // Validation

        // Dummy Data
        if (iban.equals("GR12345")) {
            throw new IllegalArgumentException("Account with IBAN" + iban + " does not exist");
        }

        // Service Call
        // accountService.deposit(iban,amount);
    }

    public void withdraw(String iban, BigDecimal amount) {

        // Validation

        // Dummy Data
        if (iban.equals("GR12345")) {
            throw new IllegalArgumentException("Account with IBAN" + iban + " does not exist");
        }

        // Service Call
        // accountService.withdraw(iban,amount);
    }

    public BigDecimal getBalance(String iban) {

        // Validation

        // Dummy Data
        if (iban.equals("GR12345")) {
            throw new IllegalArgumentException("Account with IBAN" + iban + " does not exist");
        }

        return new BigDecimal("1000");

        // Service Call
        // return accountService.getBalance(iban);
    }
}
