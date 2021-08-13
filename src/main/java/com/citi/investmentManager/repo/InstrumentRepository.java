package com.citi.investmentManager.repo;

import com.citi.investmentManager.entities.Instrument;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstrumentRepository extends JpaRepository<Instrument,Integer> {

}
