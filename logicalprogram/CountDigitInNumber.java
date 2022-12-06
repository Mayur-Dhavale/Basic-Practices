package com.logicalprogram;

import java.util.Scanner;

public class CountDigitInNumber {

	public static void main(String[] args) {
		int num;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		while (num != 0) {
			num = num / 10;
			count++;

		}
		System.out.println("The Count Is >>" + count);

	}

}
 