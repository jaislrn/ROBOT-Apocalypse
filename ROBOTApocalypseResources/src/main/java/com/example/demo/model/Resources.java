package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Resources {
	private String id;
	private String water;
	private String food;
	private String medication;
	private String ammunition;
	public Resources() {}
	public Resources(String id, String water, String food, String medication, String ammunition) {
		super();
		this.id = id;
		this.water = water;
		this.food = food;
		this.medication = medication;
		this.ammunition = ammunition;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getWater() {
		return water;
	}
	public void setWater(String water) {
		this.water = water;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getMedication() {
		return medication;
	}
	public void setMedication(String medication) {
		this.medication = medication;
	}
	public String getAmmunition() {
		return ammunition;
	}
	public void setAmmunition(String ammunition) {
		this.ammunition = ammunition;
	}
	
	



}
