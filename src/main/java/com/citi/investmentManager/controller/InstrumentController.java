package com.citi.investmentManager.controller;

import com.citi.investmentManager.entities.Instrument;
import com.citi.investmentManager.service.InstrumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/instrument")
public class InstrumentController {

    @Autowired
    private InstrumentService instrumentService;

    @GetMapping(path = "/allInstruments")
    public Collection<Instrument> getAllInstrument(){
        return instrumentService.getAllInstrument();
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public Optional<Instrument> getInstrumentById(@PathVariable("id") Integer id){
        return instrumentService.getInstrumentById(id);
    }
}
