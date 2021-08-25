package com.citi.investmentManager.repo;

import com.citi.investmentManager.entities.Bond;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BondRepository extends JpaRepository<Bond, Integer> {


}
