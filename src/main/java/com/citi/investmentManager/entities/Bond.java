package com.citi.investmentManager.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bond")
public class Bond implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bondid")
    private Integer bondId;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "bondid", referencedColumnName = "instrumentid")
    private Instrument instrumentId;

    @Column(name = "value")
    private Double value;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "company")
    private String company;

    public Bond() {

    }

    public Integer getBondId() {
        return bondId;
    }

    public void setBondId(Integer bondId) {
        this.bondId = bondId;
    }

    public Instrument getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(Instrument instrumentId) {
        this.instrumentId = instrumentId;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Bond(Integer bondId, Instrument instrumentId, Double value, String symbol, String company) {
        this.bondId = bondId;
        this.instrumentId = instrumentId;
        this.value = value;
        this.symbol = symbol;
        this.company = company;
    }
}
