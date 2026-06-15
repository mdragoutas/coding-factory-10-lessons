package gr.aueb.cf.java.ch18.bank_app.controller;

import gr.aueb.cf.java.ch18.bank_app.dto.AccountInsertDTO;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountReadOnlyDTO;
import gr.aueb.cf.java.ch18.bank_app.model.Account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountController {

    // Dummy data
    //private final List<Account> accounts = new ArrayList<>();

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance) {
        // Data binding
        //AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);
        AccountReadOnlyDTO readOnlyDTO;

        // 1. Validation

        // 2. Service Call
        // readOnlyDTO = accountService.createAccount(insertDTO);

        // Dummy Data
        readOnlyDTO = new AccountReadOnlyDTO(iban, balance);
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
