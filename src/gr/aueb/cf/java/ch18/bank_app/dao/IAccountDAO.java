package gr.aueb.cf.java.ch18.bank_app.dao;

import gr.aueb.cf.java.ch18.bank_app.model.Account;

import java.util.List;
import java.util.Optional;

/**
 * Data Access Object (DAO)
 */
public interface IAccountDAO {

    // Contract - CRUD API
    Account saveOrUpdate(Account account);

    void remove(String iban);

    Optional<Account> findByIban(String iban);

    List<Account> findAll();

    long count();

    // Queries
    boolean isAccountExists(String iban);
}
