package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.factory.DocumentFactory;
import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelServiceImpl;

@RestController
public class DocumentController {

	@Autowired
	ApplicationContext ctx;

	@GetMapping("/print/{type}")
	public String printDocument(@PathVariable("type") String type) {
	//	DocumentService service = DocumentFactory.getDocumentFactory(type);
	//	DocumentService service = (DocumentService )ctx.getBean("pdfServiceImpl");
	//	DocumentService service = (DocumentService )ctx.getBean("excelServiceImpl");
		DocumentService service = (DocumentService) ctx.getBean(type);
		service.printDocument();
		return "Finished";
	}
}
