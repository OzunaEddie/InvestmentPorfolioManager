package com.citi.investmentManager.service;


import com.citi.investmentManager.entities.Stock;
import com.citi.investmentManager.repo.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class StockServiceImpl implements StockService {

    @Autowired
    private StockRepository stockRepository;

    @Override
    public Collection<Stock> getAllStocks() {
        return stockRepository.findAll();
    }
}
