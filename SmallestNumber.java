package com.guvi;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// Initializing the scanner to get the input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first Number");
		int num1 = scanner.nextInt();
		System.out.print("Enter the Second Number");
		int num2 = scanner.nextInt();
		System.out.print("Enter the Third Number");
		int num3 = scanner.nextInt();
		// Condition to check the smallest number
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("The smallest number is the First Number " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("The smallest number is the Second Number " + num2);
		} else if (num3 <= num1 && num3 <= num1) {
			System.out.println("The smallest number is the Third Number " + num3);
		}
	}

}
