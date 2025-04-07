package com.techmasters.learnjava;

public class Basics {

	public static void main(String[] args) {
		// Java - Strings
		// Denote using double quotes " "
		// Combination of words and sentences.
		
		// String <variableName>="";
		String name="Sachin";
		System.out.println(name);
		String display="Good evening";
		System.out.println(display);
		
		//simple concept : string concatenation
		//---> combining two strings.
		// string 1 + string 2;
		String number="12";
		String number1="32";
		// String concatenation --> 
		System.out.println(number+number1);// 12 + 32 => 44;	
		// String is a Data type of storing 8bytes --> 8*8==> 64 bits.
		
		String firstName="Sachin";
		String lastName="Anil";
		String city="Bidar";
		String institute="Techmasters";
		
		// concatenation : string + string
		System.out.println("My Full name is: " + firstName + " " + lastName);
		//string + string
		System.out.println("I belong to the city : " + city);
		// string + string
		System.out.println("I train young engineers at: "+ institute);		
	}
}
