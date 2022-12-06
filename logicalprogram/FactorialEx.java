package com.logicalprogram;

import java.util.Scanner;

public class FactorialEx {

	public static void main(String[] args) {
		// factorial means 4!=4*3*2*1=24

		int fact = 1, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number..");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fact = fact * i;

		}
		System.out.println("factorial is:-"+fact);

	}

}
