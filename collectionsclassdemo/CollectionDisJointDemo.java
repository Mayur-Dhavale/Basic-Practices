package com.collectionsclassdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDisJointDemo {

	public static void main(String[] args) {
		// Main driver method
		
		//Disjoint return true if list do not have common elements otherwise false
	   
	        // Create list1
	        List<String> list1 = new ArrayList<>();
	 
	        // Add elements to list1
	        list1.add("Shoes");
	        list1.add("Toys");
	        list1.add("Horse");
	        list1.add("Bat");
	 
	        // Create list2
	        List<String> list2 = new ArrayList<>();
	 
	        // Add elements to list2
	        list2.add("Bat");
	        list2.add("Frog");
	        list2.add("Lion");
	 
	        // Check if disjoint or not
	        System.out.println(
	            Collections.disjoint(list1, list2));
	    }

}
