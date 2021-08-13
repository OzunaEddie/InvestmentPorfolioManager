package com.citi.investmentManager.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "account")
public class Account implements Serializable {

    @Id
    @Column(name = "accountid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountId;
    @Column(name = "firstname")
    private String firstName;
    @Column(name = "lastname")
    private String lastName;
    @Column(name = "cashvalue")
    private Double cashValue;
    @Column(name = "investmentvalue")
    private Double investmentValue;
    @Column(name = "networth")
    private Double netWorth;
    @Column(name = "income")
    private Double income;

    public Account(Integer accountId, String firstName, String lastName, Double cashValue, Double investmentValue, Double netWorth, Double income) {
        this.accountId = accountId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cashValue = cashValue;
        this.investmentValue = investmentValue;
        this.netWorth = netWorth;
        this.income = income;
    }

    public Account() {

    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getCashValue() {
        return cashValue;
    }

    public void setCashValue(Double cashValue) {
        this.cashValue = cashValue;
    }

    public Double getInvestmentValue() {
        return investmentValue;
    }

    public void setInvestmentValue(Double investmentValue) {
        this.investmentValue = investmentValue;
    }

    public Double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(Double netWorth) {
        this.netWorth = netWorth;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cashValue=" + cashValue +
                ", investmentValue=" + investmentValue +
                ", netWorth=" + netWorth +
                ", income=" + income +
                '}';
    }
}
