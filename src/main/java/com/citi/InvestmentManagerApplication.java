package com.citi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.citi.investmentManager"})
public class InvestmentManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InvestmentManagerApplication.class, args);
	}

}
