package com.citi.investmentManager.controller;

import com.citi.investmentManager.entities.Portfolio;
import com.citi.investmentManager.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path = "/api/portfolio")
public class PortfolioController {

    @Autowired
    PortfolioService portfolioService;

    @GetMapping(path = "/allPortfolios")
    public Collection<Portfolio> getAllPortfolio(){
        return portfolioService.getAllPortfolio();
    }

}
