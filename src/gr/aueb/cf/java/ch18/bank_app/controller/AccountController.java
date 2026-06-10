package gr.aueb.cf.java.ch18.bank_app.controller;

import gr.aueb.cf.java.ch18.bank_app.dto.AccountInsertDTO;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountReadOnlyDTO;
import gr.aueb.cf.java.ch18.bank_app.model.Account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountController {

    // Dummy data

    private final List<Account> accounts = new ArrayList<>();

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance) {
        // Data binding
        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);
        AccountReadOnlyDTO readOnlyDTO;

        // Validation
        //--

        // Dummy

        // Extract
//        String dtoIban = insertDTO.iban();
//        BigDecimal dtoBalance = insertDTO.balance();
//
//        // Mapping
//        Account account = new Account(dtoIban, dtoBalance);
//        accounts.add(account);
//
//        readOnlyDTO = new AccountReadOnlyDTO(account.getIban(), account.getBalance());

        accounts.add(new Account(iban, balance));
        readOnlyDTO = new AccountReadOnlyDTO(iban, balance);
        return readOnlyDTO;
    }
}
