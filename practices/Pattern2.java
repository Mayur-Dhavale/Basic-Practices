package com.practices;

public class Pattern2 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			
			for(int k=4;k>=i;k--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				
				System.out.print((char)(j+65));
				System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
