package com.example.arrays;
import java.util.Scanner;
public class ArrayExample {
	Scanner sc;
	static void printArray(int[] arr)
	{
		System.out.println("The array elements are : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	void addElements(int[] arr)
	{
		sc=new Scanner(System.in);
		System.out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	}
	static void printOdd(int[] arr)
	{
		int count=0;
		System.out.println("The odd numbers in the array : ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				System.out.print(arr[i]+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Count of odd number : "+count);
	}
}
