package com.silent.main.service;

import java.util.List;
import com.silent.main.entity.Train;

public interface TrainService {

	String addTrain( Train train );
	Train findTrainById( int id );
	List<Train> findAllTrain();
	String removeTrainById( int id );
	List<Train> findSourceAndDestination( String source, String destination );
}
