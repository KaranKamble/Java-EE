package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelService;

@RestController
public class DocumentController {

	DocumentService service = new ExcelService();

	@GetMapping("/documents")
	public String mainDocument() {
		service.readData();
		service.processData();
		service.printData();
		return "Done";
	}
}
