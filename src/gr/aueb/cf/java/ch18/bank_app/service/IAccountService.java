package gr.aueb.cf.java.ch18.bank_app.service;

import gr.aueb.cf.java.ch18.bank_app.core.exceptions.AccountAlreadyExistsException;
import gr.aueb.cf.java.ch18.bank_app.core.exceptions.AccountNotFoundException;
import gr.aueb.cf.java.ch18.bank_app.core.exceptions.InsufficientBalanceException;
import gr.aueb.cf.java.ch18.bank_app.core.exceptions.NegativeAmountException;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountDepositDTO;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountInsertDTO;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountReadOnlyDTO;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountWithdrawDTO;

import java.math.BigDecimal;
import java.util.List;

public interface IAccountService {

    // Αν κάναμε μόνο
    AccountReadOnlyDTO createNewAccount(AccountInsertDTO accountInsertDTO)
            throws NegativeAmountException; //, AccountAlreadyExistsException;
    void deposit(AccountDepositDTO accountDepositDTO) throws AccountNotFoundException, NegativeAmountException;
    void withdraw(AccountWithdrawDTO accountWithdrawDTO) throws AccountNotFoundException, InsufficientBalanceException;
    BigDecimal getBalance(String iban) throws AccountNotFoundException;
    List<AccountReadOnlyDTO> getAllAccounts();
}
