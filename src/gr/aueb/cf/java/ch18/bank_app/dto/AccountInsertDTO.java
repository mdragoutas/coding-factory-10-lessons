package gr.aueb.cf.java.ch18.bank_app.dto;

import java.math.BigDecimal;

public record AccountInsertDTO(String iban, BigDecimal balance) {

    public static AccountInsertDTO empty() {
        return new AccountInsertDTO("", BigDecimal.ZERO);
    }
}
