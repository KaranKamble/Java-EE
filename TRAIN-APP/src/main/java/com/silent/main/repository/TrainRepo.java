package com.silent.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.silent.main.entity.Train;

public interface TrainRepo extends JpaRepository<Train, Integer>{

}
