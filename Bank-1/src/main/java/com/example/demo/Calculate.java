package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculate {

	@GetMapping("add/{a}/{b}")
	public int add(@PathVariable("a") int a, @PathVariable("b") int b) {
		return a+b;
	}
}
