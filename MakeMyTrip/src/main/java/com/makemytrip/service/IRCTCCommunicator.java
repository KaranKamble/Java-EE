package com.makemytrip.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class IRCTCCommunicator {
	
	@Autowired
	RestTemplate restTemplate;

	public ResponseEntity<List> getAllTrainOfIRCTC() {
		String url = "http://localhost:8081/v1/train/get";
		ResponseEntity<List> responseEntity = restTemplate.getForEntity(url, List.class);
		System.out.println(responseEntity.getBody());
		return responseEntity;
	}
}
