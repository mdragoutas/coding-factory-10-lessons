package gr.aueb.cf.java.ch18.bank_app.controller;

import gr.aueb.cf.java.ch18.bank_app.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.java.ch18.bank_app.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.java.ch18.bank_app.core.exceptions.NegativeAmountException;
import gr.aueb.cf.java.ch18.bank_app.core.exceptions.ValidationException;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountDepositDTO;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountInsertDTO;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountReadOnlyDTO;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountWithdrawDTO;
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

    public AccountController(IAccountService accountService) {
        this.accountService = accountService;
    }

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance)
            throws NegativeAmountException, ValidationException {
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

        // Service Call
        return accountService.getAllAccounts();
    }

    public void deposit(String iban, BigDecimal amount)
            throws AccountNotFoundException, ValidationException, NegativeAmountException {
        // Data - Binding

        AccountDepositDTO depositDTO = new AccountDepositDTO(iban, amount);

        // Validation
        Map<String, String> errors = Validator.validateDepositDTO(depositDTO);
        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        // Service Call
         accountService.deposit(depositDTO);
    }

    public void withdraw(String iban, BigDecimal amount)
            throws InsufficientBalanceException, ValidationException, AccountNotFoundException {

        // Data - binding
        AccountWithdrawDTO withdrawDTO = new AccountWithdrawDTO(iban, amount);

        // Validation
        Map<String, String> validationErrors = Validator.validateWithdrawDTO(withdrawDTO);
        if (!validationErrors.isEmpty()) {
            throw new ValidationException(validationErrors.toString());
        }

        Map<String, String> balanceErrors = Validator.validateWithdrawBalance(withdrawDTO, accountService.getBalance(iban));
        if (!balanceErrors.isEmpty()) {
            throw new InsufficientBalanceException(balanceErrors.toString());
        }

        // Service Call
        accountService.withdraw(withdrawDTO);
    }

    public BigDecimal getBalance(String iban) throws AccountNotFoundException, ValidationException {

        // Validation
        Map<String, String> errors = Validator.validateIban(iban);
        if (!errors.isEmpty()) {
            throw new ValidationException(errors.toString());
        }

        // Service Call
        return accountService.getBalance(iban);
    }
}
