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

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stockid", referencedColumnName = "instrumentid")
    private Instrument instruments;
    @Column(name = "value")
    private Double value;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "company")
    private String company;


    //will need the class for this to work
    //https://www.baeldung.com/jpa-one-to-one






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
        return instruments;
    }

    public void setInstruments(Instrument instruments) {
        this.instruments = instruments;
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
                "instruments=" + instruments +
                ", value=" + value +
                ", symbol='" + symbol + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
