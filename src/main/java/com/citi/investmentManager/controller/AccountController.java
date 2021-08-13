package com.citi.investmentManager.controller;

import com.citi.investmentManager.entities.Account;
import com.citi.investmentManager.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(path = "/allAccounts")
    public Collection<Account> getAllAccount(){
        return accountService.getAllAccount();
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public Optional<Account> getAccountById(@PathVariable("id") Integer id){
        return accountService.getAccountById(id);
    }


}
