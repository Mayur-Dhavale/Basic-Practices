package com.java8feactures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Java8_1 {

	public static void main(String[] args) {
	
		List<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(20);
		list.add(60);
		
		System.out.println("Origanal List Data"+list);
		
		System.out.println("***************************");
		
		list.forEach(i->System.out.println(i));
		
		System.out.println("*********NATURAL ORDER SORTING*********");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(i->System.out.println(i));
		
		System.out.println("*********DESCENDING ORDER SORTING*********");
		
		list.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(System.out::println);
		
		List<Integer> li=list.stream().filter(i->i>20).map(i->i).collect(Collectors.toList());
		
		System.out.println("Filter value is"+li);
		
		boolean la=list.stream().anyMatch(p->p==50);
		System.out.println(la);
		
		

	}

}
