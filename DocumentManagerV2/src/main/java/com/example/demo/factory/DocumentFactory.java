package com.example.demo.factory;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelServiceImpl;
import com.example.demo.service.PdfServiceImpl;

public class DocumentFactory {

	public static DocumentService getDocumentFactory(String type) {
		if (type.equals("excelService"))
			return new ExcelServiceImpl();
		else if (type.equals("pdfService"))
			return new PdfServiceImpl();
		return null;
	}
}
