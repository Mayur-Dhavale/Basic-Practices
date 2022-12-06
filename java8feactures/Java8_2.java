package com.java8feactures;

import java.util.Arrays;
import java.util.HashMap;

public class Java8_2 {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> l=new HashMap<>();
		
		l.put(1, "Mayur");
		l.put(4, "mauli");
		l.put(5, "shashi");
		l.put(3, "anand");
		l.put(2, "sagar");
		
		
		
		l.forEach((k,v)->System.out.println(k+ ":"+v));
		
		int[] arr= {1,2,4,5,6};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
	
	

	
	

}
