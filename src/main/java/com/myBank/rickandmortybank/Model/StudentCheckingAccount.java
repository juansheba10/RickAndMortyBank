package com.myBank.rickandmortybank.Model;

import com.myBank.rickandmortybank.Enum.Status;
import jakarta.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class StudentCheckingAccount extends CheckingAccount {

    public StudentCheckingAccount() {
        super();
        // Establecer el balance mínimo y la tarifa de mantenimiento a cero para estudiantes
        setMinimumBalance(BigDecimal.ZERO);
        setMonthlyMaintenanceFee(BigDecimal.ZERO);
    }

    // Constructor que permite la creación de una cuenta con valores personalizados pero sin tarifas
    public StudentCheckingAccount(String secretKey, BigDecimal balance, AccountHolder primaryOwner, LocalDate creationDate, Status status) {
        super(secretKey, balance, primaryOwner, creationDate, status, BigDecimal.ZERO, BigDecimal.ZERO);
    }
}
