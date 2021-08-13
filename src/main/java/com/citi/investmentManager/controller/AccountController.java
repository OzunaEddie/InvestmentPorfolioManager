package com.citi.investmentManager.controller;

import com.citi.investmentManager.entities.Account;
import com.citi.investmentManager.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path = "/api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(path = "/allAccounts")
    public Collection<Account> getAllAccount(){
        return accountService.getAllAccount();
    }

}
