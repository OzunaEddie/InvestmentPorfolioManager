package com.citi.investmentManager.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "portfolio")
public class Portfolio implements Serializable {

    @Id
    @Column(name = "portfolioid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer portfolioId;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "accountid")
    private Account account;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instrumentid")
    private Instrument instrument;

    @Column(name = "currentvalue")
    private Double currentValue;

    @Column(name = "sharecount")
    private Integer shareCount;

    @Column(name = "date")
    private Date date;

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public Portfolio(Integer portfolioId, Account account, Instrument instrument, Double currentValue, Date date) {
        this.portfolioId = portfolioId;
        this.account = account;
        this.instrument = instrument;
        this.currentValue = currentValue;
        this.date = date;
    }

    public Portfolio() {
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Integer getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Integer portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Instrument getInstruments() {
        return instrument;
    }

    public void setInstruments(Instrument instruments) {
        this.instrument = instruments;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
