package com.makemytrip.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.makemytrip.entity.MMTTrain;
import com.makemytrip.repository.MMTTrainRepository;

@Service
public class MMTTrainServiceImpl implements MMTTrainService {

	@Autowired
	private MMTTrainRepository mmtTrainRepo;

	@Autowired
	private IRCTCCommunicator irctcCommunicator;

	@Override
	public List<MMTTrain> findAllTrains() {
		irctcCommunicator.getAllTrainOfIRCTC();
		return null;
	}

	@Override
	public void addTrain() {
		/*
		 * ResponseEntity<List> responseEntity = irctcCommunicator.getAllTrainOfIRCTC();
		 * List<MMTTrainDTO> trains = (List<MMTTrainDTO>) responseEntity.getBody();
		 * 
		 * List<MMTTrain> mmtTrains = new ArrayList<>();
		 * 
		 * for (MMTTrainDTO train : trains) { System.out.println(train);
		 * mmtTrains.add(train); }
		 */

	}

}