package com.myBank.rickandmortybank.Model;

import com.myBank.rickandmortybank.Enum.Status;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String secretKey;

    private BigDecimal balance;
    @ManyToOne
    @JoinColumn(name = "primary_owner_id")
    private AccountHolder primaryOwner;

    @ManyToOne
    @JoinColumn(name = "secondary_owner_id")
    private AccountHolder secondaryOwner;
    private BigDecimal penaltyFee;
    private LocalDate creationDate;
    private Status status;

    public Account() {
        this.balance = new BigDecimal(1000); // Default value
        this.penaltyFee = new BigDecimal(40); // Default value
        this.creationDate = LocalDate.now(); // Default value
        this.status = Status.ACTIVE; // Default value
    }

    public Account(String secretKey, BigDecimal balance, AccountHolder primaryOwner, LocalDate creationDate, Status status) {
        this();
        this.secretKey = secretKey;
        this.balance = balance;
        this.primaryOwner = primaryOwner;
        this.creationDate = creationDate;
        this.status = status;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public java.math.BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(java.math.BigDecimal balance) {
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AccountHolder getPrimaryOwner() {
        return primaryOwner;
    }

    public void setPrimaryOwner(AccountHolder primaryOwner) {
        this.primaryOwner = primaryOwner;
    }

    public AccountHolder getSecondaryOwner() {
        return secondaryOwner;
    }

    public void setSecondaryOwner(AccountHolder secondaryOwner) {
        this.secondaryOwner = secondaryOwner;
    }

    public java.math.BigDecimal getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(java.math.BigDecimal penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    public java.time.LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(java.time.LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
