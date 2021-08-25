package com.citi.investmentManager.repo;


import com.citi.investmentManager.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

}
