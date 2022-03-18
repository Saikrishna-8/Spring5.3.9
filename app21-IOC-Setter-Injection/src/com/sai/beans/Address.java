package com.sai.beans;

public class Address {
	
	private String village;
	private String mandal;
	private String city;
	private String state;
	private String country;
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getMandal() {
		return mandal;
	}
	public void setMandal(String mandal) {
		this.mandal = mandal;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	public Address()
	{
	}
	
	public Address(String village, String mandal, String city, String state, String country) {
		super();
		this.village = village;
		this.mandal = mandal;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [village=" + village + ", mandal=" + mandal + ", city=" + city + ", state=" + state
				+ ", country=" + country + "]";
	}
	
	
	
	
	
}
