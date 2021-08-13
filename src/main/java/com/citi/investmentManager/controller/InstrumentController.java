package com.citi.investmentManager.controller;

import com.citi.investmentManager.entities.Account;
import com.citi.investmentManager.entities.Instrument;
import com.citi.investmentManager.service.AccountService;
import com.citi.investmentManager.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping(path = "/api/instrument")
public class InstrumentController {

    @Autowired
    private InstrumentService instrumentService;

    @GetMapping(path = "/allInstruments")
    public Collection<Instrument> getAllInstrument(){
        return instrumentService.getAllInstrument();
    }
}
