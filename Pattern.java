package com.guvi;

public class Pattern {

	public static void main(String[] args) {
		//Loop for pattern
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				//Condition to check for printing
				if (j > i) {
					System.out.print(j);
				} else {
					System.out.print(i);
				}
			}
			System.out.println();
		}

	}

}
