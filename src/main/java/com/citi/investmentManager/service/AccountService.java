package com.citi.investmentManager.service;

import com.citi.investmentManager.entities.Account;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;


public interface AccountService {
    Collection<Account> getAllAccount();

}
