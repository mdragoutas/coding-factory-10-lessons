package gr.aueb.cf.java.ch18.bank_app.dao;

import gr.aueb.cf.java.ch18.bank_app.model.Account;

import java.util.*;

public class AccountDAOImpl implements IAccountDAO {

    private final List<Account> accounts = new ArrayList<>();

    @Override
    public Account saveOrUpdate(Account account) {
        int index = accounts.indexOf(account);

        // Αν δεν υπάρχει το account
        if (index == -1) {
            accounts.add(account);      // insert
            return account;
        }

        // Αν υπάρχει ήδη το account
        accounts.set(index, account);   // update
        return accounts.get(index);
    }

    @Override
    public void remove(String iban) {
        accounts.removeIf(account -> account.getIban().equals(iban));
    }

    @Override
    public Optional<Account> findByIban(String iban) {
        return accounts.stream()
                .filter(account -> account.getIban().equals(iban))
                .findFirst();
    }

    @Override
    public List<Account> findAll() {
        return Collections.unmodifiableList(accounts);
    }

    @Override
    public long count() {
        return accounts.size();
    }

    @Override
    public boolean isAccountExists(String iban) {
        return accounts.stream()
                .anyMatch(account -> account.getIban().equals(iban));
    }
}
