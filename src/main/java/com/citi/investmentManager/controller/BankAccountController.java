package com.citi.investmentManager.controller;

import com.citi.investmentManager.entities.BankAccount;
import com.citi.investmentManager.service.BankAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/bankaccount/")
public class BankAccountController {

    @Autowired
    private BankAccountService bankAccountService;

    @GetMapping(path = "/allBankAccounts")
    public Collection<BankAccount> getAllBankAccounts() {
        return bankAccountService.getAllBankAccounts();
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public Optional<BankAccount> getBankAccountById(@PathVariable Integer id) {
        return bankAccountService.getBankAccountById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteBankAccountById(@PathVariable Integer id) {
         bankAccountService.deleteBankAccountById(id);
    }
}
