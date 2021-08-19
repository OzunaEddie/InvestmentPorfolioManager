package com.citi.investmentManager.entities;


import javax.persistence.*;
import javax.sound.sampled.Port;
import java.io.Serializable;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonManagedReference;

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
    @Column(name = "income")
    private Double income;



    @OneToMany(mappedBy = "account", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Portfolio> portfolio;


    public Set<Portfolio> getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Set<Portfolio> portfolio) {
        this.portfolio = portfolio;
    }

    public Account(Integer accountId, String firstName, String lastName, Double income) {
        this.accountId = accountId;
        this.firstName = firstName;
        this.lastName = lastName;
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
                ", income=" + income +
                '}';
    }
}
