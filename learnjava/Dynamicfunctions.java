package com.techmasters.methods.learnjava;

import java.util.Scanner;

public class Dynamicfunctions {
	
	public void display() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter firstnumber: ");
		int n1=scan.nextInt();
		System.out.println("Enter secondnumber: ");
		int n2=scan.nextInt();
		int add=n1+n2;
		scan.close();
		System.out.println("Adding two numbers is: "+add);
		
	}
	public static void main(String[] args) {
		Dynamicfunctions ob=new Dynamicfunctions();
		//invoking the method 
		// calling the function
		ob.display();// pass by value approach
	}

}
