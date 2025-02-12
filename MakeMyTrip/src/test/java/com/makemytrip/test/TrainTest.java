package com.makemytrip.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.makemytrip.service.MMTTrainService;

@SpringBootTest
public class TrainTest {

	@Autowired
	private MMTTrainService trainServiceImpl;

	@Test
	void add_Train() {
		this.trainServiceImpl.addTrain();
	}
}
