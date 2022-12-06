package com.logicalprogram;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		int sum=0;
		int n,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number:");
		n=sc.nextInt();
		while(n>0) {
			b=n%10;
			sum=sum+b;
			n=n/10;
		}
		System.out.println("Sum of Digit==>"+sum);

	}

}
