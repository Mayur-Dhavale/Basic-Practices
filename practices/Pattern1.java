package com.practices;

public class Pattern1 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=3;j>=1;j--) {
				if(j>i) {
					System.out.print("s"+" ");
				}
				else {
					System.out.print("*"+" ");
				}
			}
			System.out.println();
		}

	}

}
