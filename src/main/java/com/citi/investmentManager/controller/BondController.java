package com.citi.investmentManager.controller;

import com.citi.investmentManager.entities.Account;
import com.citi.investmentManager.entities.Bond;
import com.citi.investmentManager.entities.Instrument;
import com.citi.investmentManager.service.AccountService;
import com.citi.investmentManager.service.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/bond")
public class BondController {

    @Autowired
    private BondService bondService;

    @GetMapping(path = "/allBonds")
    public Collection<Bond> getAllBonds(){
        return bondService.getAllBonds();
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public Optional<Bond> getBondById(@PathVariable("id") Integer id){
        return bondService.getBondById(id);
    }


}
