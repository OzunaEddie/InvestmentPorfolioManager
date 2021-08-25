package com.citi.investmentManager.service;

import com.citi.investmentManager.entities.Bond;

import java.util.Collection;
import java.util.Optional;


public interface BondService {
    Collection<Bond> getAllBonds();
    Optional<Bond> getBondById(Integer id);
    Bond addNewBond(Bond bond);
    void deleteBond(Bond bond);
}
