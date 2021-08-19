package com.citi.investmentManager.controller;

import com.citi.investmentManager.entities.Bond;
import com.citi.investmentManager.service.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/bond")
@CrossOrigin
public class BondController {
    
    @Autowired
    private BondService bondService;

    @GetMapping(path = "/allBonds")
    public Collection<Bond> getAllBonds() {
        return bondService.getAllBonds();
    }

    @GetMapping(path = "/{id}")
    @ResponseBody
    public Optional<Bond> getBondById(@PathVariable("id") Integer id) {
        return bondService.getBondById(id);
    }

    @PostMapping(path = "/bond")
    @ResponseBody
    public void addBond(@RequestBody Bond bond) { bondService.addNewBond(); }

    @DeleteMapping(path = "/{id}")
    @ResponseBody
    public void deleteBond(@PathVariable("id") Integer id) { bondService.deleteBond(id); }

}
