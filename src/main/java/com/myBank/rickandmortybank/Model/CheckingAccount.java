package com.myBank.rickandmortybank.Model;

import com.myBank.rickandmortybank.Enum.Status;
import jakarta.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

public class CheckingAccount extends Account{
    private BigDecimal minimumBalance;
    private BigDecimal monthlyMaintenanceFee;

    public CheckingAccount() {
        super();
        // Valores predeterminados específicos para cuentas de cheques
        this.minimumBalance = new BigDecimal("250.00");  // Ejemplo de balance mínimo
        this.monthlyMaintenanceFee = new BigDecimal("12.00");  // Ejemplo de tarifa de mantenimiento
    }

    // Constructor que permite la creación de una cuenta con valores personalizados
    public CheckingAccount(String secretKey, BigDecimal balance, AccountHolder primaryOwner, LocalDate creationDate, Status status, BigDecimal minimumBalance, BigDecimal monthlyMaintenanceFee) {
        super(secretKey, balance, primaryOwner, creationDate, status);
        this.minimumBalance = minimumBalance;
        this.monthlyMaintenanceFee = monthlyMaintenanceFee;
    }

    // Getters y setters para los nuevos campos
    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public BigDecimal getMonthlyMaintenanceFee() {
        return monthlyMaintenanceFee;
    }

    public void setMonthlyMaintenanceFee(BigDecimal monthlyMaintenanceFee) {
        this.monthlyMaintenanceFee = monthlyMaintenanceFee;
    }
}
