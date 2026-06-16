package gr.aueb.cf.java.ch18.bank_app.dto;

import java.math.BigDecimal;

public record AccountDepositDTO(String iban, BigDecimal balance) {
}
