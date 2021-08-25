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
    @JoinColumn(name = "instrumentid")
    private Instrument instrument;

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

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
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

    public Bond(Integer bondId, Instrument instrument, Double value, String symbol, String company) {
        this.bondId = bondId;
        this.instrument = instrument;
        this.value = value;
        this.symbol = symbol;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Bond{" +
                "bondId=" + bondId +
                ", instrument=" + instrument +
                ", value=" + value +
                ", symbol='" + symbol + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
