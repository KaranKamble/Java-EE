package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankService {

	@GetMapping("deposite/{name}/{acNo}/{amount}")
	String deposite(@PathVariable("name") String name, @PathVariable("acNo") int acNo,
			@PathVariable("amount") int amount) {

		System.out.println("deposited rupees  " + amount);

		return "deposite has done";
	}

	@GetMapping("withdrawl/{acNo}/{amount}/{pin}/{name}")
	String withdrwal(@PathVariable("acNo") int acNo, @PathVariable("amount") int amount, @PathVariable("pin") int pin,
			@PathVariable("name") String name) {

		System.out.println("withdrwal is done " + amount);
		return "withdrwal of ruppes  " + amount;

	}
	
	@PostMapping("/openAccount")
	public String openAccount( @RequestBody Account account) {
		account.getName();
		String email = account.getEmail();
		System.out.println("Dear "+account.getName()+" your Account has opened Successfully");
		return "Dear "+account.getName()+" your Account has opened Successfully";
	}
	
}
