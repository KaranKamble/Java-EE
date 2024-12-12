package com.example.demo.service;

public class PdfServiceImpl extends GenericDocument {

	@Override
	public void processData() {
		System.out.println("Processing data of PDF");
	}

	@Override
	public void printData() {
		System.out.println("Printing data of PDF");
	}

}
