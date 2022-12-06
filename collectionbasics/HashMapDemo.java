package com.collectionbasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<>();
		hm.put(1, "Mayur");
		hm.put(3, "Digambar");
		hm.put(2, "Anil");
		
		//hm.put(1, "Suraj"); when we try to add duplicate  key it takes updated value
		hm.put(null, "Ram");
		hm.put(null, "Sai");
		//hm.forEach((k,v)->System.out.println(k+" "+v));
		  Set<Integer> s =hm.keySet();
		  Iterator<Integer> itr=s.iterator();
	  while(itr.hasNext()) {
		Integer i= itr.next();
		System.out.println("KEY IS ::"+i);
		System.out.println("VALUE IS::"+hm.get(i));
		  }
		

	}

}
