package com.citi.investmentManager.service;

import com.citi.investmentManager.entities.Account;

import java.util.Collection;
import java.util.Optional;


public interface AccountService {
    Collection<Account> getAllAccount();
    Optional<Account> getAccountById(Integer id);

}
