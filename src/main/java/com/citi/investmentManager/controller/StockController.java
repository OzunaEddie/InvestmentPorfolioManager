package com.citi.investmentManager.controller;


import com.citi.investmentManager.entities.Stock;
import com.citi.investmentManager.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path = "/api/stock")
public class StockController {
    public StockController() {

    }

    @Autowired
    private StockService stockService;

    @GetMapping(path = "/allStocks")
    public Collection<Stock> getAllStocks() {
        return stockService.getAllStocks();
    }
}
