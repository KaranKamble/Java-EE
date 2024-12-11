package com.example.demo.factory;
import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelService;
import com.example.demo.service.PdfService;
import com.example.demo.service.WordService;

public class DocumentFactory {

	public static DocumentService getDocumentFactory(String type) {
		if(type.equals("excelService"))
			return new ExcelService();
		else if( type.equals("pdfService"))
			return new PdfService();
		else
			return new WordService();
	}
}
