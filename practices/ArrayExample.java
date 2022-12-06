package com.practices;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] myIntArray = { 2, 3, 6, 7, 8, 1 };

		for (int i = 0; i < myIntArray.length; i++) {
			for (int j = i+1; j <=myIntArray.length-1; j++) {

				int sum = myIntArray[i] + myIntArray[j];
				
				if(sum==9) {
					System.out.println("Sum  : " + sum +  " position : " + i+ "    "+j);
					 break;
				}
				
			}

		}

	}

}
