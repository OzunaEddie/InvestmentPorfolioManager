package com.citi.investmentManager.service;

import com.citi.investmentManager.entities.Instrument;
import com.citi.investmentManager.repo.AccountRepository;
import com.citi.investmentManager.repo.InstrumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Transactional
public class InstrumentServiceImpl implements InstrumentService {

    @Autowired
    private InstrumentRepository repository;


    @Override
    public Collection<Instrument> getAllInstrument() {
        return repository.findAll();
    }
}
