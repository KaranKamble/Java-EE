package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalciService {

	@GetMapping("/calci/{operation}/{a}/{b}")
	public int calculator(@PathVariable("operation") String operation, @PathVariable("a") int a,
			@PathVariable("b") int b) {
		if (operation.equals("add")) {
			System.out.println("Addition of " + a + " and " + b + " is " + (a + b));
			return a + b;
		} else if (operation.equals("sub"))
			return a - b;
		else if (operation.equals("mul"))
			return a * b;
		else if (operation.equals("div"))
			return a / b;
		return 0;

	}
}
