package com.mylogistics.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //<-- this will create table employee in the DB
public class Route {
	@Id //<-- pls make id as primary key 
	@GeneratedValue(strategy = GenerationType.AUTO) //<-- this will make id auto_increment
	private int id;
	private String source;
	private String destination;
	private double distance;
	private int noOfDays;
	private String location;
	private String vehicle;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	public String getVehicle() {
		return vehicle;
	}
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Route [id=" + id + ", source=" + source + ", destination=" + destination + ", distance=" + distance
				+ ", noOfDays=" + noOfDays + ", location=" + location + ", vehicle=" + vehicle + "]";
	}
	
	
	
}

