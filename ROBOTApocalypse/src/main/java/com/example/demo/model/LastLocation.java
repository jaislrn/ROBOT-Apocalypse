package com.example.demo.model;

import org.springframework.stereotype.Component;

@Component
public class LastLocation {
	private String lattitude;
	private String longitude;
	public LastLocation() {}
	public LastLocation(String lattitude, String longitude) {
		this.lattitude = lattitude;
		this.longitude = longitude;
	}
	public String getLattitude() {
		return lattitude;
	}
	public void setLattitude(String lattitude) {
		this.lattitude = lattitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	@Override
	public String toString() {
		return "LastLocation [lattitude=" + lattitude + ", longitude=" + longitude + "]";
	}
	
	
}
