package com.irctc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.irctc.entity.Train;
import com.irctc.service.TrainService;

@RestController
@RequestMapping("v1/train")
public class TrainController {

	@Autowired
	private TrainService trainService;

	@PostMapping
	public ResponseEntity<Object> addTrain(@RequestBody Train train) {
		this.trainService.addTrain(train);

		return new ResponseEntity<Object>("Train Added", HttpStatus.CREATED);
	}

	@GetMapping("/get")
	public ResponseEntity<List> getTrains() {
		List<Train> list = this.trainService.findAvailableTrains();
		return new ResponseEntity<List>(list, HttpStatus.CREATED);
	}

}
