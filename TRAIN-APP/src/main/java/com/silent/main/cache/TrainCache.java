package com.silent.main.cache;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;
import com.silent.main.entity.Train;

@Component
public class TrainCache {

	private Map<Integer, Train> trainCache = new HashMap<Integer, Train>();

	public Train getcache(int trainId) {
		if (this.trainCache.containsKey(trainId))
			return this.trainCache.get(trainId);
		return null;
	}

	public void saveCache(Train train) {
		this.trainCache.put(train.getId(), train);
	}

}
