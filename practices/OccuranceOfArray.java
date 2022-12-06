package com.practices;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OccuranceOfArray {
	

//	Array = {1,3,4,0,3,1,11,34,3}
//	
	//Write a program to find the Second Highest number in an Array using java 8 features.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a[] = {1,3,4,0,3,1,11,34,3};
//		 List<Integer> li=Arrays.asList(a);
//		 
		int a1 =Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(a1);
//		
//		 li.stream() 
//	      .collect(Collectors.groupingBy(s -> s))
//	      .forEach((k, v) -> System.out.println(k +" : "+ v.size()));

	}

}
