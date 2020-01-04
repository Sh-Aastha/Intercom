package com.intercom.domain;

public class Customer implements Comparable<Customer> {
	
	private String name;
	
	private Integer user_id;
	
	private double latitude;
	
	private double longitude;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", user_id=" + user_id
				+ ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}

	@Override
	public int compareTo(Customer cust) {
		return this.getUser_id().compareTo(cust.getUser_id());
	}
	
	

	
}
