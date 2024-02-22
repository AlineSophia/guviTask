package com.guvi;

import java.util.Scanner;

public class Billing {

	public static void main(String[] args) {
		// Initializing the scanner to get the input from the user
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Product Amount");
		int price = scanner.nextInt();

		int totalAmount = 0;
		int discountAmount = 0;

		// Calculate the discount
		if (price >= 500 && price <= 1000) {
			discountAmount = (10 * price) / 100;
			totalAmount = price - discountAmount;
		} else if (price > 1000) {
			discountAmount = (20 * price) / 100;
			totalAmount = price - discountAmount;
		} else {
			totalAmount = price;
		}
		// Final amount
		System.out.println("Discounted Final Price = " + totalAmount);
	}

}
