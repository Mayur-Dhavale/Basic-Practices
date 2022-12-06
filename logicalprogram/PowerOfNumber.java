package com.logicalprogram;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		int pow;
		int num;
		int i=1;
		int sum=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number:-");
		num=sc.nextInt();
		System.out.println("Enter the power :-");
		pow=sc.nextInt();
		while(i<=pow) {
			sum=sum*num;
			i++;
		}
		System.out.println(num+"to the power "+pow+" is equal to="+sum);
		

	}

}
