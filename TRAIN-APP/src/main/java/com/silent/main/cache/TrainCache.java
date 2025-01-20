package com.silent.main.cache;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.silent.main.entity.Train;
import com.silent.main.repository.TrainRepo;

import jakarta.annotation.PostConstruct;

@Component
public class TrainCache /* implements InitializingBean */ {

	@Autowired
	private TrainRepo trainRepo;

	private Map<Integer, Train> trainCache = new HashMap<Integer, Train>();

	public Train getcache(int trainId) {
		if (this.trainCache.containsKey(trainId))
			return this.trainCache.get(trainId);
		return null;
	}

	public void saveCache(Train train) {
		this.trainCache.put(train.getId(), train);
	}

	public void clearTrainCache() {
		trainCache.clear();
	}

	/*
	 * @Override 
	 * public void afterPropertiesSet() throws Exception {
	 * 		System.out.println("TrainCache.afterPropertiesSet() called"); 
	 * 		List<Train> trainList = trainRepo.findAll(); 
	 * 		for (Train train : trainList) {
	 * 				trainCache.put(train.getId(), train); 
	 * 		} 
	 * }
	 */

			// OR

	@PostConstruct
	public void buildCacheAtStartUp() {
		List<Train> trainList = trainRepo.findAll();
		for( Train train : trainList ) {
			trainCache.put(train.getId(), train);
		}
	}

}
