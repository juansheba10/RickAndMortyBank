package com.myBank.rickandmortybank.Model;

import com.myBank.rickandmortybank.Enum.Status;
import jakarta.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class SavingsAccount extends Account {
    private BigDecimal interestRate; // Tasa de interés aplicada a la cuenta
    private BigDecimal minimumBalance; // Balance mínimo para evitar penalizaciones

    public SavingsAccount() {
        super();
        // Establecer valores predeterminados
        this.interestRate = new BigDecimal("0.02"); // 2% de interés por defecto
        this.minimumBalance = new BigDecimal("1000"); // Ejemplo de balance mínimo
    }

    // Constructor que permite la creación de una cuenta con valores personalizados
    public SavingsAccount(String secretKey, BigDecimal balance, AccountHolder primaryOwner, LocalDate creationDate, Status status, BigDecimal interestRate, BigDecimal minimumBalance) {
        super(secretKey, balance, primaryOwner, creationDate, status);
        this.interestRate = interestRate;
        this.minimumBalance = minimumBalance;
    }

    // Getters y setters
    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
    }
}