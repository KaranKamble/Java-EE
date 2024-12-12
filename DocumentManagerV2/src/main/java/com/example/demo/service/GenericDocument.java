package com.example.demo.service;

public abstract class GenericDocument implements DocumentService {

	@Override
	public void printDocument() {
		this.getData();
		this.processData();
		this.printData();
	}
	@Override
	public void getData() {
		System.out.println("Getting data from DB");
	}
}
