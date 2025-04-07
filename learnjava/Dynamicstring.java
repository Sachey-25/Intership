package com.techmasters.learnjava;

import java.util.Scanner;

public class Dynamicstring {

	public static void main(String[] args) {
		// write a code to add two numbers
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		String num1=sc.next(); // string input...
		System.out.println("Enter the second number: ");
		String num2=sc.next();
		System.out.println("Addding two numbers: " + num1+num2);
		sc.close();
	}
}