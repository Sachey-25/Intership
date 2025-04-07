package com.techmasters.methods.practice;

import java.util.Scanner;

public class Sqaurenumbers {
	//Write a method that returns the square of a number.
	public int squareofnumber() {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sqaure=n*n;
		System.out.println("Square of given number is: " + sqaure);
		return 0;
	}
	
	public static int getSquare(int number) {
		return number*number;
	}

	public static void main(String[] args) {
		// Write a method that returns the square of a number.
		// Create an object
		Sqaurenumbers obj=new Sqaurenumbers();
		obj.squareofnumber();
		
		// Second approach
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to sqaure: ");
		int input=sc.nextInt();
		//Call method
		int result=getSquare(input); // call by reference.
		System.out.println("Sqaure of " + input + "is" + result);
		sc.close();
		}

}
