package com.citi.investmentManager.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;



@Entity
@Table(name = "instrument")
public class Instrument implements Serializable {

    @Id
    @Column(name = "instrumentid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer instrumentId;

    @Column(name = "quote")
    private Double quote;

    @OneToMany(mappedBy = "instrument", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Portfolio> portfolio;

    @OneToOne(mappedBy = "instrument")
    private Bond bond;

    @OneToOne(mappedBy = "instrument")
    private Etf etf;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instrumentid")
    private Stock stock;




    public Instrument(Integer instrumentId, Double quote) {
        this.instrumentId = instrumentId;
        this.quote = quote;
    }

    public Instrument() {

    }

    public Integer getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(Integer instrumentId) {
        this.instrumentId = instrumentId;
    }

    public Double getQuote() {
        return quote;
    }

    public void setQuote(Double quote) {
        this.quote = quote;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "instrumentId=" + instrumentId +
                ", quote=" + quote +
                '}';
    }
}
