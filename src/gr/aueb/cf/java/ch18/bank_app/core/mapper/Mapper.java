package gr.aueb.cf.java.ch18.bank_app.core.mapper;

import gr.aueb.cf.java.ch18.bank_app.dto.AccountInsertDTO;
import gr.aueb.cf.java.ch18.bank_app.dto.AccountReadOnlyDTO;
import gr.aueb.cf.java.ch18.bank_app.model.Account;

public class Mapper {

    /**
     * No instances of this class should be available
     */
    private Mapper() {}

    public static Account mapToModelEntity(AccountInsertDTO insertDTO) {
        return new Account(insertDTO.iban(), insertDTO.balance());
    }

    public static AccountReadOnlyDTO mapToReadOnlyDTO(Account account) {
        return new AccountReadOnlyDTO(account.getIban(), account.getBalance());
    }
}
