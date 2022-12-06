package com.logicalprogram;

import java.util.Scanner;

public class ArmstrongNumber {
//Amrmstrong Number is number 153 whose sum of all number cube is same as number
	public static void main(String[] args) {
		int num;
		int sum = 0;
		int i;
		int n=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Number...");
		num=sc.nextInt();
		i=num;
		 while(num>0) {
			 n=num%10;
			 num=num/10;
			 sum=sum+(n*n*n);
		 }
		 if(sum==i) {
			 System.out.println("Number is Armstrong==>"+""+i);
		 }
		 else {
			 System.out.println("Number is Not Armstrong");
		 }
		  
		  
		

	}

}
