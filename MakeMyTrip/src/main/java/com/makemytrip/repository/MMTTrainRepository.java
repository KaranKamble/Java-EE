package com.makemytrip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.makemytrip.entity.MMTTrain;

public interface MMTTrainRepository extends JpaRepository<MMTTrain, Integer>{

}
