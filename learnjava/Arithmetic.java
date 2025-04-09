package com.techmasters.methods.learnjava;

public class Arithmetic {
	
	//method declaration
//	int ---> return type 
//			void --- no return type
	public static void addition() {
		double num1=123;
		double num2=234;
		double add=num1+num2;
		System.out.println("Addition of 123 and 234 is : " + add);
	}
	public static void subtraction() {
		double num1=123;
		double num2=234;
		double add=num1-num2;
		System.out.println("Subtration 123 and 234 is : " + add);
	}
	public static void multiplication() {
		double num1=123;
		double num2=234;
		double add=num1*num2;
		System.out.println("Multiply of 123 and 234 is : " + add);
	}
	public static void division() {
		double num1=123;
		double num2=234;
		double add=num1/num2;
		System.out.println("Division of 123 and 234 is : " + add);
	}
	public static void modulous() {
		double num1=123;
		double num2=234;
		double add=num1%num2;
		System.out.println("Modolus of 123 and 234 is : " + add);
	}
	
	public static int add(double num1, double num2) {
		double add=num1+num2;
		System.out.println("Addition of 123 and 234 is : " + add);
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Arithmetic obj=new Arithmetic();
//		obj.addition();
//		obj.subtraction();
//		obj.multiplication();
//		obj.division();
//		obj.modulous();
//		addition();
//		subtraction();
//		multiplication();
//		division();
//		modulous();
		System.out.println("---------------------");
		add(123,234);
		
		

	}

}
