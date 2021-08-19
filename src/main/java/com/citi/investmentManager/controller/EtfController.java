package com.citi.investmentManager.controller;


import com.citi.investmentManager.entities.Etf;
import com.citi.investmentManager.service.EtfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/etf")
public class EtfController {

    @Autowired
    private EtfService etfService;

    @GetMapping(path = "allEtfs")
    public Collection<Etf> getAllEtfs() {
        return etfService.getAllEtfs();
    }

    @GetMapping(path = "{id}")
    @ResponseBody
    public Optional<Etf> getEtfById(@PathVariable("id") Integer id) {
        return etfService.getEtfById(id);
    }

}
