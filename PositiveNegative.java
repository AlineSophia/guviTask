package com.guvi;

import java.util.Scanner;

public class PositiveNegative {
	// Main method
	public static void main(String[] args) {
		// Initializing scanner to get the input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Number");
		int num = scanner.nextInt();
		// Condition for Validating number Number
		if (num > 0) {
			System.out.println("The given number is a Positive Number");
		} else if (num < 0) {
			System.out.println("The givem number is a Negative Number");
		} else {
			System.out.println("The number is zero");
		}
	}

}
