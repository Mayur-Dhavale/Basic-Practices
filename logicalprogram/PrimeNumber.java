package com.logicalprogram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// prime number program it is number which is divisible itself & 1 only
		int n;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("Number is prime..");
		} else {
			System.out.println("Number is not prime");
		}

	}

}
