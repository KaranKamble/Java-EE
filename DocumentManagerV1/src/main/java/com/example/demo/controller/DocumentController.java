package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.factory.DocumentFactory;
import com.example.demo.service.DocumentService;


@RestController
public class DocumentController {


	@GetMapping("/documents/{type}")
	public String mainDocument(@PathVariable("type") String type) {
		DocumentService service = DocumentFactory.getDocumentFactory(type);
		service.readData();
		service.processData();
		service.printData();
		return "Done";
	}
}
