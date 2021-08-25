package com.citi.investmentManager.entities;

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
    @Column(name = "accountid")
    private Integer accountId;

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

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "bankId=" + bankId +
                ", bankName='" + bankName + '\'' +
                ", cashValue=" + cashValue +
                ", accountType='" + accountType + '\'' +
                ", accountId=" + accountId +
                '}';
    }
}
