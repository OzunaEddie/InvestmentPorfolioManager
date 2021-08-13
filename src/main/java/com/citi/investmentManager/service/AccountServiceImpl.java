package com.citi.investmentManager.service;


import com.citi.investmentManager.entities.Account;
import com.citi.investmentManager.repo.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

@Service
@Transactional
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository repository;
    
    @Override
    public Collection<Account> getAllAccount() {
        return repository.findAll();
    }

}
