package com.citi.investmentManager.repo;

import com.citi.investmentManager.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Collection;


public interface AccountRepository extends JpaRepository<Account,Integer> {


}
