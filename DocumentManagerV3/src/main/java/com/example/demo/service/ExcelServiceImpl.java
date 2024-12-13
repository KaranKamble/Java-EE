package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class ExcelServiceImpl extends GenericDocument{

	@Override
	public void processData() {
		System.out.println("Processing data of Excel");		
	}

	@Override
	public void printData() {
		System.out.println("Printing data of Excel");	
		System.out.println("==========================");
	}

}
