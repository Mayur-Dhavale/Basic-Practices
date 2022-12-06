package com.logicalprogram;

import java.util.Scanner;

public class Swapnumber {

	public static void main(String[] args) {
		// Swaping of number by using third variable z.
		int x,y,z;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x");
		x=sc.nextInt();
		System.out.println("Enter the value of y");
		y=sc.nextInt();
		System.out.println("Before Swaping value:"+x+y);
		z=x;
		x=y;
		y=z;
		System.out.println("after swaping value:"+x+y);
	

	}

}
