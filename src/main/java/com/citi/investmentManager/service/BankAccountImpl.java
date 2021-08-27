package com.citi.investmentManager.service;

import com.citi.investmentManager.entities.BankAccount;
import com.citi.investmentManager.repo.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

@Service
@Transactional
public class BankAccountImpl implements BankAccountService {

    @Autowired
    private BankAccountRepository repository;

    @Override
    public Collection<BankAccount> getAllBankAccounts() {
        return repository.findAll();
    }

    @Override
    public Optional<BankAccount> getBankAccountById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void deleteBankAccountById(Integer id) {
        repository.deleteById(id);
    }
}
