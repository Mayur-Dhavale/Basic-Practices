package com.collectionsclassdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsClassDemo {
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		list.add("Mayur");
		list.add("Anil");
		list.add("Diamabar");
		

		Collections.addAll(list, "Dipali", "Sanjivani", "Anajali");
		Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
		// Collections.reverse(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");

		}

	}

}
