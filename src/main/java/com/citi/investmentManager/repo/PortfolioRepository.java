package com.citi.investmentManager.repo;

import com.citi.investmentManager.entities.Portfolio;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.sound.sampled.Port;

public interface PortfolioRepository extends JpaRepository<Portfolio,Integer> {

}