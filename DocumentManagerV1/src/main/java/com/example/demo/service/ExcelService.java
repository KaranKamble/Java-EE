package com.example.demo.service;

public class ExcelService implements DocumentService{

	@Override
	public void readData() {
		System.out.println("read data from db");
	}
	@Override
	public void processData() {
		System.out.println("process data for Excel");
	}
	@Override
	public void printData() {
		System.out.println("print data for Excel");
	}

}
