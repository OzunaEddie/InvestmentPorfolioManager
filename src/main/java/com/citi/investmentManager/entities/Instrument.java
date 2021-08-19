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

    @Column(name = "askprice")
    private Double askPrice;

<<<<<<< HEAD
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instrumentid")
    private Etf etf;
=======
    @OneToMany(mappedBy = "instrument", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Portfolio> portfolio;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instrumentid")
    private Bond bond;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instrumentid")
    private Stock stock;


>>>>>>> 0a4f4a09a7cd1259e175f98938201aae872bd593

    public Instrument(Integer instrumentId, Double askPrice) {
        this.instrumentId = instrumentId;
        this.askPrice = askPrice;
    }

    public Instrument() {

    }

    public Integer getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(Integer instrumentId) {
        this.instrumentId = instrumentId;
    }

    public Double getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(Double askPrice) {
        this.askPrice = askPrice;
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "instrumentId=" + instrumentId +
                ", askPrice=" + askPrice +
                '}';
    }
}
