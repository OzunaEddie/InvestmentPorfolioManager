package com.citi.investmentManager.controller;

import com.citi.investmentManager.entities.Bond;
import com.citi.investmentManager.service.BondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

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
    public ResponseEntity<Bond> addBond(@RequestBody Bond bond) {
        try {
            bondService.addNewBond(bond);
            return new ResponseEntity<>(bond, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(path = "/{id}")
    @ResponseBody
    public ResponseEntity<HttpStatus> deleteBond(@PathVariable("id") Bond bond) {
        try {
            bondService.deleteBond(bond);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
