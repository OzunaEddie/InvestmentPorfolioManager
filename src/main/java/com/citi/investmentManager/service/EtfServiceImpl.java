package com.citi.investmentManager.service;

import com.citi.investmentManager.entities.Etf;
import com.citi.investmentManager.repo.EtfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Optional;

@Service
@Transactional
public class EtfServiceImpl implements EtfService{

   @Autowired
   private EtfRepository repository;

    @Override
    public Collection<Etf> getAllEtfs() {
        return repository.findAll();
    }

    @Override
    public Optional<Etf> getEtfById(Integer id) {
        return repository.findById(id);
    }
}
