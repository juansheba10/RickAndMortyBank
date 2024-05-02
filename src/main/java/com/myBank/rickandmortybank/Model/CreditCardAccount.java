package com.myBank.rickandmortybank.Model;

import com.myBank.rickandmortybank.Enum.Status;
import jakarta.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class CreditCardAccount extends Account {
    private BigDecimal creditLimit;   // Límite de crédito para la cuenta
    private BigDecimal interestRate;  // Tasa de interés aplicada al saldo
    private BigDecimal penaltyFee;    // Tarifa de penalización por atrasos o exceder el límite

    public CreditCardAccount() {
        super();
        this.creditLimit = new BigDecimal("5000.00"); // Ejemplo de límite de crédito
        this.interestRate = new BigDecimal("0.20");   // 20% de interés anual por defecto
        this.penaltyFee = new BigDecimal("50.00");    // Ejemplo de tarifa de penalización
    }

    public CreditCardAccount(String secretKey, BigDecimal balance, AccountHolder primaryOwner, AccountHolder secondaryOwner, LocalDate creationDate, Status status, BigDecimal creditLimit, BigDecimal interestRate, BigDecimal penaltyFee) {
        super(secretKey, balance, primaryOwner, creationDate, status);
        this.secondaryOwner = secondaryOwner; // Optional secondary owner
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.penaltyFee = penaltyFee;
    }

    // Getters y setters para los nuevos campos
    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(BigDecimal penaltyFee) {
        this.penaltyFee = penaltyFee;
    }
}
