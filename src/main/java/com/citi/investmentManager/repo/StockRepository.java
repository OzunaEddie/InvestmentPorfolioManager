package com.citi.investmentManager.repo;

import com.citi.investmentManager.entities.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StockRepository extends JpaRepository<Stock, Integer> {

}
