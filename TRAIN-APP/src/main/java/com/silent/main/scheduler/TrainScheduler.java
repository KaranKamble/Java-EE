package com.silent.main.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.silent.main.cache.TrainCache;

@Component
public class TrainScheduler {

	@Autowired
	private TrainCache trainCache;
	
//	@Scheduled(cron = "0/15 * * * * ?")
	public void trainScheduler() {
		System.out.println("TrainScheduler.trainScheduler() called");
		trainCache.clearTrainCache();
	}
}
