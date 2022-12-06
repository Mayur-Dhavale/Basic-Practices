package com.springpractise;

public class Reversestring {

	public static void main(String[] args) {
		
		//without using inbuild reverse() method .
	   String s1="mayur";
	   char chart[]=s1.toCharArray();
	   for(int i=chart.length-1;i>=0;i--) {
		   System.out.print(chart[i]);
	   }
			   

	}

}
