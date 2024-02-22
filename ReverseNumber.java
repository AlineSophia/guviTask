package com.guvi;

import java.util.Scanner;

public class ReverseNumber {

	// Main Method
	public static void main(String[] args) {
		// Initializing scanner to get the input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Number to Reverse");
		int num = scanner.nextInt();
		// Initializing variables
		int temp = 0;
		int result = 0;
		while (num != 0) {
			temp = num % 10; // to get the quotient of the number
			num = num / 10; // to get the division of the number
			result = (result * 10) + temp; // to reverse the value
		}
		System.out.println(result); // final result

	}

}
