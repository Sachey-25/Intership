package com.techmasters.learnjava;

public class Extenedloops {

	public static void main(String[] args) {
		// loop-- for loop
		int n=8;
		for(int i=0; i<n; i++) {
			//within the loop
			for(int j=0;j<n;j++) {
				if(i==0)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
