package com.techmasters.methods.practice;

import java.util.Scanner;

public class Primenumber {
	
	public static void primenumber() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number: ");
		int input=sc.nextInt();
		for(int i=2; i<=input; i++) {
			if(input%i==0 && input%input==0) {
				System.out.println("Not primenumber");;
			}
		}
		System.out.println("Prime number");
		sc.close();		
	}
	public static void main(String[] args) {
		//invoke the function
		primenumber();
	}
}
