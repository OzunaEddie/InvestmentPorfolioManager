package com.citi.investmentManager.service;

import com.citi.investmentManager.entities.Etf;

import java.util.Collection;
import java.util.Optional;

public interface EtfService {
    Collection<Etf> getAllEtfs();
    Optional<Etf> getEtfById(Integer id);
}
