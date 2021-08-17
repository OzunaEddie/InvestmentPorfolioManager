package com.citi.investmentManager.repo;

import com.citi.investmentManager.entities.Bond;
import com.citi.investmentManager.entities.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;


public interface BondRepository extends JpaRepository<Bond, Integer> {


}
