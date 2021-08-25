package com.citi.investmentManager.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="bankaccount")
public class BankAccount implements Serializable {

    @Id
    @Column(name = "bankid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bankId;
    @Column(name = "bankname")
    private String bankName;
    @Column(name = "cashvalue")
    private Double cashValue;
    @Column(name = "accounttype")
    private String accountType;

    // not sure if we need to make getters and setters for different operations for the project
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accountid")
    private Account account;

    public Integer getBankId() {
        return bankId;
    }

    public void setBankId(Integer bankId) {
        this.bankId = bankId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Double getCashValue() {
        return cashValue;
    }

    public void setCashValue(Double cashValue) {
        this.cashValue = cashValue;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }



    @Override
    public String toString() {
        return "BankAccount{" +
                "bankId=" + bankId +
                ", bankName='" + bankName + '\'' +
                ", cashValue=" + cashValue +
                ", accountType='" + accountType +
                '}';
    }
}
