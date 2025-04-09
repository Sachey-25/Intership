package com.techmasters.methods.learnjava;

public class Dynamicmethods {
	
	public void greetings() {
		System.out.println("Good afternoon!!!");
	}
	
	public static void greet() {
		System.out.println("This is crazy!");
	}
	
	private void hello() {
		System.out.println("This is private");
	}
	private static void helloagain() {
		System.out.println("This is static private");
	}
	protected static void disp() {
		System.out.println("This is proteted access specifier");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object - class : Dynamicmethods
		Dynamicmethods obj=new Dynamicmethods();
		obj.greetings();
		obj.hello();
		disp();
		helloagain();
		greet();

	}
	
}
