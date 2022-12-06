package com.practices;

import java.util.HashMap;
import java.util.Map;

public class StringOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="This is my my first Java Java 8 program compiler";
		
		String[] strArray =s.split(" ");
		
		Map<String, Integer>map=new HashMap<String, Integer>();
		
		for(String s1:strArray) {
			
			if(map.containsKey(s1)) {
				map.put(s1, map.get(s1)+1);
			}
			else {
				map.put(s1, 1);
			}
			
		}
		for(Map.Entry<String, Integer> map1:map.entrySet()) {
			System.out.println("Word"+":"+map1.getKey()+" "+"NoOfOccurance"+" "+map1.getValue());
		}

	}

}
