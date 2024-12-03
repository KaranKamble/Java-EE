package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankServices {

	
	@GetMapping("deposite/{acNo}/{amount}")
	String deposite(@PathVariable("acNo")   int acNo,@PathVariable("amount")  int amount) {

		System.out.println("deposited");

		return "deposte done for rupees : "+amount;

	}

	int withdrwal(int acNo, int pinNO, int amount, String name) {

		System.out.println("withdrwal sucess");

		return 10000;
	}

	@GetMapping("checkBal/{pin}/{acNO}/{name}")
	int checkBalance(@PathVariable("pin") int pin,@PathVariable("acNO") int acNO,@PathVariable("name") String name) {

		
		System.out.println("u r balance is 5000");
		
		return 5000;

	}

}