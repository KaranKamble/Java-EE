package com.silent.main.service;

import java.util.List;
import com.silent.main.entity.Train;

public interface TrainService {

	public String addTrain( Train train );
	public Train findTrainById( int id );
	public List<Train> findAllTrain();
	public String removeTrainById( int id );
	public List<Train> findSourceAndDestination( String source, String destination );
}
