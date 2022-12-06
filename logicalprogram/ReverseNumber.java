package com.logicalprogram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int a,b;
		int d=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Number");
		a=sc.nextInt();//12
		while(a>0) {
			b=a%10;//2,
			a=a/10;//1
			d=(d*10)+b;//2
			 
		}
		System.out.println("Reverse Number::"+d);
	}

}
