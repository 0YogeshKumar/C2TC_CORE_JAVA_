package com.example.inheritance.multilevel;

public class City extends State{
	private String cityName;
	private float area;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [City Name : " + cityName + ", Area : " + area + ", State Name : "+ getStateName()+", State Capital : "+getStateCapital()+", Country Name : "+ getCountryName()+", Country Capital : "+getCapital()+"]";
	}
	

}
