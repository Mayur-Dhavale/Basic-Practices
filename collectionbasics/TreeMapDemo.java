package com.collectionbasics;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap<Integer,String> tm=new TreeMap<>();
		tm.put(1, "Osmanabad");
		tm.put(3, "pune");
		tm.put(2, "Barshi");
		tm.put(2, "lakhi"); // its takes updated value when we add duplicate key.
		
		//tm.put(null, "mumbai"); //null key is not allowed becuse interpreter should not understanding how to sort null value
		
		  
	 Set<Entry<Integer, String>> set= tm.entrySet();
	    Iterator<Entry<Integer, String>> itr=set.iterator();
	    
	    while(itr.hasNext()) {
	Entry<Integer, String> me= itr.next();
	System.out.println("The key is ::"+me.getKey());
	System.out.println("The value is ::"+me.getValue());
	    }
	}

}
