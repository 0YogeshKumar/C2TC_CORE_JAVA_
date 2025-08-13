package com.example.constructors;

public class Customers {
	private String name;
	private int id;

	public Customers()
	{
		this.name="John";
		this.id=1;
	}
	public Customers(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	public String toString() {
        return "Customer Name: " + name + ", ID: " + id;
	}
}
