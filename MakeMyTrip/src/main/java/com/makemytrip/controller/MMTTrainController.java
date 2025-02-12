package com.makemytrip.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.makemytrip.service.IRCTCCommunicator;

@RestController
@RequestMapping("v1/mmttrain")
public class MMTTrainController {

	@Autowired
	private IRCTCCommunicator irctcCommunicator;
	
	@GetMapping("/get")
	public ResponseEntity<List> getAllTrain(){
		return this.irctcCommunicator.getAllTrainOfIRCTC();
	}
}
