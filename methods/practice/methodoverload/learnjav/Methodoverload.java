package com.techmasters.methodoverload.learnjav;

public class Methodoverload {
	//First method
	public void example(int n1, int n2) {
		int sum=n1+n2+n2; // n1=5 and n2=6
		sum+=5;
		sum=n2+n1+n2;
		sum *=2;
		System.out.println(sum);
	}
	//Second method
	public void example(double n1, double n2) {
		double value=n1*n2*n2;
		value *=4;
		value -=10;
		double value1 = value;
		System.out.println(value1);
		
	}
	public void print(String message) {
		System.out.println(message);
	}
	public void print(String message, int n) {
		for(int i=0; i<=n; i++) {
			System.out.println(message);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Methodoverload obj=new Methodoverload();
		// invoke function --- call the function
		// provide value with respect to the parameters
		// taken
		obj.print("Good afternoon",10);
		obj.example(5.3, 6.3);

	}

}
