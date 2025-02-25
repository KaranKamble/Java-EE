package com.silent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import com.silent.dto.OnboardingDTO;
import com.silent.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class OnBoardEmployee {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/onboard")
	public ResponseEntity<?> onBoardEmployee( @RequestBody OnboardingDTO onboardingDTO ){
		
		employeeService.onBoarding(onboardingDTO);
		
		return new ResponseEntity<>("Offer Released",HttpStatus.ACCEPTED);
	}
}
