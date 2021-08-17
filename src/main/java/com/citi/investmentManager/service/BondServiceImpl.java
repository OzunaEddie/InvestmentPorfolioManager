package com.citi.investmentManager.service;


import com.citi.investmentManager.entities.Account;
import com.citi.investmentManager.entities.Bond;
import com.citi.investmentManager.entities.Instrument;
import com.citi.investmentManager.repo.AccountRepository;
import com.citi.investmentManager.repo.BondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

@Service
@Transactional
public class BondServiceImpl implements BondService{

    @Autowired
    private BondRepository repository;

    @Override
    public Collection<Bond> getAllBonds() {
        return null;
    }

    @Override
    public Optional<Bond> getBondById(Integer id){

        return repository.findById(id);
    }

}
