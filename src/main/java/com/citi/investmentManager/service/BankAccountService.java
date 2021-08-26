package com.citi.investmentManager.service;

import com.citi.investmentManager.entities.BankAccount;
import org.springframework.context.annotation.Bean;

import java.util.Collection;
import java.util.Optional;
public interface BankAccountService{
    Collection<BankAccount> getAllBankAccounts();
    Optional<BankAccount> getBankAccountById(Integer id);
    void deleteBankAccount(BankAccount bankAccount);


}
