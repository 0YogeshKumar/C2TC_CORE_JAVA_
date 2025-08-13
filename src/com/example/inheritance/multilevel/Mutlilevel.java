package com.example.inheritance.multilevel;

public class Mutlilevel {
	public static void main(String[] args)
	{
		City city=new City();
		city.setCityName("Ooty");
		city.setArea(500.5f);
		city.setStateName("Tamil Nadu");
		city.setStateCapital("Chennai");
		city.setCountryName("India");
		city.setCapital("New Delhi");
		System.out.println(city);
	}
}
