package com.citi.investmentManager.controller;



import com.citi.investmentManager.entities.Stock;
import com.citi.investmentManager.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

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

    @GetMapping(path = "{id}")
    @ResponseBody
    public Optional<Stock> getAccountById(@PathVariable("id") Integer id){
        return stockService.getStockbyId(id);
    }
}
