package com.silent.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.silent.main.entity.Train;
import com.silent.main.service.TrainService;

@RestController
@CrossOrigin
@RequestMapping("/train")
public class TrainController {

	@Autowired
	private TrainService trainService;

	@PostMapping("/add")
	public String addTrain(@RequestBody Train train) {
		return trainService.addTrain(train);
	}

	@GetMapping("/find/{id}")
	public Train findTrain(@PathVariable("id") int id) {
		return trainService.findTrainById(id);
	}

	@GetMapping("/findAll")
	public List<Train> findAllTrain() {
		return trainService.findAllTrain();
	}

	@DeleteMapping("/remove/{id}")
	public String removeTrain(@PathVariable("id") int id) {
		return trainService.removeTrainById(id);
	}

	@GetMapping("/trains/{source}/{destination}")
	public List<Train> getTrainsBySourceAndDestination(@PathVariable("source") String source,@PathVariable("destination")String destination){
		return trainService.findSourceAndDestination(source, destination);			
	}

}
