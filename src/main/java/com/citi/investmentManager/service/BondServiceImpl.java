package com.citi.investmentManager.service;

import com.citi.investmentManager.entities.Bond;
import com.citi.investmentManager.repo.BondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

@Service
@Transactional
public class BondServiceImpl implements BondService{

    @Autowired
    private BondRepository repository;

    @Override
    public Collection<Bond> getAllBonds() {
        return repository.findAll();
    }

    @Override
    public Optional<Bond> getBondById(Integer id){
        return repository.findById(id);
    }

    @Override
    public Bond addNewBond(Bond bond) {
        bond.setBondId(0);
        return repository.save(bond);
    }

    @Override
    public void deleteBond(Bond bond) {
        repository.delete(bond);
    }

}
