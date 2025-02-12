package com.irctc.service;

import java.util.List;

import com.irctc.entity.Train;

public interface TrainService {

	void addTrain(Train train);

	Train deleteTrainByName(String trainName);

	List<Train> findAvailableTrains();

	Train findTrainByName(String trainName);

}