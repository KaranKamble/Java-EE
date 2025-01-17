package com.silent.main.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silent.main.entity.Train;
import com.silent.main.repository.TrainRepo;

@Service
public class TrainServiceImpl implements TrainService {

	@Autowired
	private TrainRepo repo;

	@Override
	public String addTrain(Train train) {
		repo.save(train);
		return train.getTrainName() + " train added Successfully in RDBMS.";
	}

	@Override
	public Train findTrainById(int id) {
		Optional<Train> train = repo.findById(id);
		return train.get();
	}

	@Override
	public List<Train> findAllTrain() {
		return repo.findAll();
	}

	@Override
	public String removeTrainById(int id) {
		repo.deleteById(id);
		return "Train with id " + id + " has removed from RDBMS ";
	}

}
