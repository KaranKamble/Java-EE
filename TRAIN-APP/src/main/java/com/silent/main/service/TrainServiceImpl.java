package com.silent.main.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silent.main.cache.TrainCache;
import com.silent.main.entity.Train;
import com.silent.main.repository.TrainRepo;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainCache cache;

	@Autowired
	private TrainRepo repo;

	@Override
	public String addTrain(Train train) {
		this.repo.save(train);
		return train.getTrainName() + " train added Successfully in RDBMS.";
	}

	@Override
	public Train findTrainById(int id) {
		Train trainFromCache = this.cache.getcache(id);
		if (trainFromCache != null)
			return trainFromCache;
		else {
			Optional<Train> trainFromDB = this.repo.findById(id);
			this.cache.saveCache(trainFromDB.get());
			return trainFromDB.get();
		}
	}

	@Override
	public List<Train> findAllTrain() {
		return this.repo.findAll();
	}

	@Override
	public String removeTrainById(int id) {
		this.repo.deleteById(id);
		return "Train with id " + id + " has removed from RDBMS ";
	}

}
