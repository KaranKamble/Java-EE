package com.makemytrip.service;

import java.util.List;
import com.makemytrip.entity.MMTTrain;

public interface MMTTrainService {

	List<MMTTrain> findAllTrains();
	
	void addTrain();
}
