package com.collectionbasics;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapTest {

	public static void main(String[] args) {
	
		LinkedHashMap<Integer, String> ls=new LinkedHashMap<>();
		
		ls.put(101, "Mayur");
		ls.put(102, "sagar");
		ls.put(103, "sanjay");
		ls.put(104, "shashi");
		ls.put(null, "shashi");//one key null allowed & many null value allowed 
	    ls.put(null, "Amol");// when two  key null taken then it will take new null value
	    ls.put(103, "Rahul");
		
		System.out.println(ls); //output by insertion order
		
		System.out.println("--------Iterating by iterator---------");
		
		Set<Integer> s=ls.keySet();// stores all key to the s set
		Iterator<Integer> itr= s.iterator();
		
		while (itr.hasNext()) {
			Integer key = (Integer) itr.next();
			System.out.println("Key :"+key);
			System.out.println("Value:"+ls.get(key)); 
			
		}
		
	}

}
