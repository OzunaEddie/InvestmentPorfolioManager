package com.citi.investmentManager.repo;

import com.citi.investmentManager.entities.Etf;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtfRepository extends JpaRepository<Etf, Integer> {
}
