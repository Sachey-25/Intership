package com.techmasters.methods.practice;

import java.util.Scanner;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		str=str.toLowerCase();
		int start =0;
		int end=str.length()-1;
		
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String input="MALAYALAM";
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		
		if(isPalindrome(input)) {
			System.out.println(input + " is palindrome");
		}else {
			System.out.println(input + " is not palindrome");
		}
	}

}
