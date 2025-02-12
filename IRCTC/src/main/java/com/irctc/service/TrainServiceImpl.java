package com.irctc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.irctc.entity.Train;
import com.irctc.exception.TrainException;
import com.irctc.repository.TrainRepository;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepository trainRepo;

	@Override
	public void addTrain(Train train) {
		try {
			this.trainRepo.save(train);
		} catch (Exception e) {
			throw new TrainException("Something went wrong with DB, Please try again");
		}
	}

	@Override
	public Train deleteTrainByName(String trainName) {

		return null;
	}

	@Override
	public List<Train> findAvailableTrains() {
		return this.trainRepo.findAll();
	}

	@Override
	public Train findTrainByName(String trainName) {

		return null;
	}

}
