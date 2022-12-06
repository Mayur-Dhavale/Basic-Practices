package com.patternprogram;

public class PatternProgr_5 {
	public static void main(String[] args) {
		int n=5;
		int k=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(" "+k);
				k++;     // here ++ is same as k+1
				// k+=2;     // it is same as k=k+2
			}
			System.out.println();
		}
	}

}
