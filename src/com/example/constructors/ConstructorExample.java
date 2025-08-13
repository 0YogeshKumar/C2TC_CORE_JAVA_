package com.example.constructors;

import java.util.Scanner;
public class ConstructorExample {

	public static void main(String[] args) {
		Customers c1=new Customers();
		System.out.println(c1);
		Customers c2=new Customers("Alice",2);
		System.out.println(c2);
		Scanner in=new Scanner(System.in);
		System.out.print("Enter name : ");
		String name=in.next();
		System.out.print("Enter id : ");
		int id=in.nextInt();
		Customers c3=new Customers(name,id);
		System.out.println(c3);
	}
}
