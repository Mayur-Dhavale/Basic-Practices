package com.collectionsclassdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClassCopy {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Collections.sort(list);
	
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		List<Integer> list1=new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		Collections.copy(list, list1);
		
	  for(int i=0; i<list1.size();i++) {
		  System.out.print(list1.get(i)+" ");
	  }
		

	}

}
