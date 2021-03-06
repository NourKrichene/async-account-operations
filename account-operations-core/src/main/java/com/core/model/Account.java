package com.core.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    BigDecimal balance;
    String owner;
    Date creationDate;

    public Account() {
    }

    public Account(BigDecimal balance , String owner , Date creationDate) {
        this.balance = balance;
        this.owner = owner;
        this.creationDate = creationDate;
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
