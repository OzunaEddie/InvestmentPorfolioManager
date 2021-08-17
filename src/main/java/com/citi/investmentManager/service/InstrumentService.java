package com.citi.investmentManager.service;

import com.citi.investmentManager.entities.Instrument;

import java.util.Collection;
import java.util.Optional;

public interface InstrumentService {
    Collection<Instrument> getAllInstrument();
    Optional<Instrument> getInstrumentById(Integer id);
}
