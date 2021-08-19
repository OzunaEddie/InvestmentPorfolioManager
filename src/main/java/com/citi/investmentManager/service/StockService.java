package com.citi.investmentManager.service;

import com.citi.investmentManager.entities.Stock;

import java.util.Collection;
import java.util.Optional;

public interface StockService {

    Collection<Stock> getAllStocks();

    Optional<Stock> getStockbyId(Integer id);
}
