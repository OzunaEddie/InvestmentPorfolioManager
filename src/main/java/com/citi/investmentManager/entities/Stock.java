package com.citi.investmentManager.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "stock")
public class Stock implements Serializable {


    Stock() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "stockid")
    private Integer stockid;

    @OneToOne(mappedBy = "stock")
    private Instrument instrument;

    @Column(name = "value")
    private Double value;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "company")
    private String company;


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

    public Instrument getInstruments() {
        return instrument;
    }

    public void setInstruments(Instrument instruments) {
        this.instrument = instruments;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "instruments=" + instrument +
                ", value=" + value +
                ", symbol='" + symbol + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
