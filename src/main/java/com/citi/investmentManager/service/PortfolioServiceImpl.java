package com.citi.investmentManager.service;


import com.citi.investmentManager.entities.Portfolio;
import com.citi.investmentManager.repo.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class PortfolioServiceImpl implements PortfolioService {

    @Autowired
    PortfolioRepository repository;

    public Collection<Portfolio> getAllPortfolio(){
        return repository.findAll();
    }

}
