package com.citi.investmentManager.entities;

import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "etf")
public class Etf implements Serializable {

    Etf() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "etfid")
    private Integer etfId;

    @OneToOne(mappedBy = "etf")
    private Instrument instrument;
    @Column(name = "value")
    private Double value;
    @Column(name = "symbol")
    private String symbol;
    @Column(name = "company")
    private String company;

    public Integer getEtfId() {
        return etfId;
    }

    public void setEtfId(Integer etfId) {
        this.etfId = etfId;
    }

    public Instrument getInstruments() {
        return instrument;
    }

    public void setInstruments(Instrument instrument) {
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

    @Override
    public String toString() {
        return "Etf{" +
                "etfId=" + etfId +
                ", instrument=" + instrument +
                ", value=" + value +
                ", symbol='" + symbol + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
