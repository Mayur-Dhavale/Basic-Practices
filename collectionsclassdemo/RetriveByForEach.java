package com.collectionsclassdemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RetriveByForEach {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();

		// Add elements to list1
		list1.add("Shoes");
		list1.add("Toys");
		list1.add("Horse");
		list1.add("Bat");
		// Retriving Element by for each
		// for(String str:list1) {
		// System.out.println(str);
		// }

		// Retriving Element by Iterator
		// Iterator<String> itr = list1.iterator();
		//
		// while (itr.hasNext()) {
		// System.out.println(itr.next());
		// }
       
		//Retriving Elements by for loop
		for(int i=0; i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
	}

}
