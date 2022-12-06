package com.logicalprogram;

public class FibonacciSeriesDemo {

	public static void main(String[] args) {
	
		int x=0,y=1,z,n=10;
		System.out.print(x+" "+y);
		for(int i=2;i<10;i++) {
			z=x+y;
			x=y;
			y=z;
			System.out.print(" "+z);
			
			
					
		}
		
		

	}

}
