package org.techmasters.codejava;

public class Switchstatement {

	public static void main(String[] args) {
		//Switch Statement
		//syntax:
		//String --- "" -- "combination words 
		//and sentences defined in double qoutes"
		// String --> non-premitive datatype byte, short, int, float, double, long
		//String day="Thrusday"; // 8bytes
		int day=8;
		//chat day='Thrusday'; // 2 bytes // UNICODE Symbols
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thrusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Day of the week doesn't listed..!!");
		}
	}
}