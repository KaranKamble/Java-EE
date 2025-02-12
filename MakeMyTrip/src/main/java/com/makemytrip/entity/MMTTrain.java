package com.makemytrip.entity;

import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="tbl_mmttrain")
public class MMTTrain {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int TrainId;
	private String trainName;
	private String source;
	private String destination;

	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime arrivalDateTime;
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime departureDateTime;

	private int totalSeats;
	private int availableSeats;
	
	public MMTTrain() {
	}

	public MMTTrain(int trainId, String trainName, String source, String destination, LocalDateTime arrivalDateTime,
			LocalDateTime departureDateTime, int totalSeats, int availableSeats) {
		TrainId = trainId;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.arrivalDateTime = arrivalDateTime;
		this.departureDateTime = departureDateTime;
		this.totalSeats = totalSeats;
		this.availableSeats = availableSeats;
	}

	public int getTrainId() {
		return TrainId;
	}

	public void setTrainId(int trainId) {
		TrainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDateTime getArrivalDateTime() {
		return arrivalDateTime;
	}

	public void setArrivalDateTime(LocalDateTime arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}

	public LocalDateTime getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(LocalDateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	
}
