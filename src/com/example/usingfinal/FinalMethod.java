package com.example.usingfinal;

public class FinalMethod {
	
	final int a=10;
	
	public FinalMethod() {
		System.out.println("In the default constructor");
	}
	
	final void show() {
		System.out.println("The value of a "+a);
	}
	
	void display(){
		
	}
	public static void main(String[] args)
	{
		FinalMethod f=new FinalMethod();
		f.show();
	}

}