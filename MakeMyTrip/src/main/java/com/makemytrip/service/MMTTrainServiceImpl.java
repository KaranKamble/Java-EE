package com.makemytrip.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.makemytrip.entity.MMTTrain;

@Service
public class MMTTrainServiceImpl implements MMTTrainService {

	@Autowired
	private IRCTCCommunicator irctcCommunicator;

	@Override
	public List<MMTTrain> findAllTrains() {
		irctcCommunicator.getAllTrainOfIRCTC();
		return null;
	}

	@Override
	public void addTrain() {
		ResponseEntity<List> responseEntity = irctcCommunicator.getAllTrainOfIRCTC();
		List<MMTTrain> trains = responseEntity.getBody();
		
	//	for (MMTTrain train : trains) {
			System.out.println(trains);
	//	}

	}

}
