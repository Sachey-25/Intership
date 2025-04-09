package com.techmasters.learnjava;

public class Loop {

	public static void main(String[] args) {
		// Operators
		int number=5;
		number++; // increased by 1 hence 5 becomes 6.
		number++; // 6++ Increased by 1 hence 6 becomes 7.
		// Before execution and After execution
		
		// --> Syso() --> considered as execution.
		
		
		System.out.println(number++); //7++ : 8
		System.out.println(number); // 8 
		// whenever we see ++ that means a number 
		// should increases by 1 and that's it.
		// 5 ---> 6 ---> 7---> 8---> 9--->10
		
		System.out.println(number++); // 8++ : 9 ??? NO
		System.out.println(number + " <---- New Value");
		
		// pre increased
		// increases first and executes
		++number; // 9 --> 10
		//-->>> 10 >>>>> 11.
		System.out.println(++number + "<--- This is new value");// 11
		
		// Assignment Operators
		int num;
		num = 45;
		num += 2; //:--> num = num+2 ; 45+2 : 47	
		System.out.println("New Value: "+ num);
		System.out.println("num =num+2: " + num); // 47
		
		num -= 10; // num = num-10 ; 47-10 ==> 37;
		System.out.println("Subtract: " + num);
		
		num *=2; // num = num*2 ==> 37*2 ==> 74
		System.out.println("Multiply by 2 : " + num);
		
	}
}
