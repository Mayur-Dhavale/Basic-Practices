 package com.collectionbasics;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableTest {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<>();
		ht.put(101, "pune");
		ht.put(102, "mumbai");
		ht.put(103, "India ");
		ht.put(103, "Maharastra");
	    //ht.put(null, "Maharastra");// key & value null not allowed
		
		
		
		System.out.println(ht);//out put unordered
		
		System.out.println("-------Iterating by Iterator------");
		
		Set<Integer> s=ht.keySet();//all key store in set
	   Iterator<Integer> itr=s.iterator();//iterate
	   
	   while (itr.hasNext()) {
		Integer key = (Integer) itr.next();
		System.out.println("key :"+key);
		System.out.println("value :"+ht.get(key));
		
	}
		
		
		
		

	}

}
