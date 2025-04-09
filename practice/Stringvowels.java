package com.techmasters.methods.practice;

public class Stringvowels {
	
	//Create a method that takes a string
	// and returns the number of vowels in it.
	public static int countVowels(String input) {
		int count=0;
		input=input.toLowerCase();
		for(int i=0; i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// 
		String word="Education";
		System.out.println("Vowel count in: "+ word + countVowels(word));

	}

}
