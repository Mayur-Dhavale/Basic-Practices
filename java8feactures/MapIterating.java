package com.java8feactures;

import java.util.HashMap;
import java.util.Map;

public class MapIterating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "Mayur");
		map.put(2, "Anil");
		map.put(3, "Digambar");
		
		//BY JAVA8
		//map.forEach((K,V)->System.out.println(K+" "+V));
		
		//BY FOREACH
//		for(Map.Entry<Integer,String> ma:map.entrySet()) {
//			System.out.println(ma.getKey()+" "+ma.getValue());
//		}
		
		for(Integer lm:map.keySet()) {
			System.out.println(lm+" "+map.get(lm));
		}

	}

}
