package com.silent.main.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Train {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String trainName;
	private String source;
	private String destination;
	@Temporal(TemporalType.DATE)
	private LocalDate departureDate;
	@Temporal(TemporalType.DATE)
	private LocalDate arrivalDate;
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime departureTime;
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime arrivalTime;

	public Train() {
	}

	public Train(int id, String trainName, String source, String destination, LocalDate departureDate, LocalDate arrivalDate,
			LocalDateTime departureTime, LocalDateTime arrivalTime) {
		this.id = id;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(LocalDate departureDate) {
		this.departureDate = departureDate;
	}

	public LocalDate getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(LocalDate arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public LocalDateTime getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(LocalDateTime departureTime) {
		this.departureTime = departureTime;
	}

	public LocalDateTime getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(LocalDateTime arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + trainName + ", source=" + source + ", destination=" + destination
				+ ", departureDate=" + departureDate + ", arrivalDate=" + arrivalDate + ", departureTime="
				+ departureTime + ", arrivalTime=" + arrivalTime + "]";
	}

}
