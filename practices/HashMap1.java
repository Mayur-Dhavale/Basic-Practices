package com.practices;

import java.util.Map;
import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> fields = new HashMap<String, String> () {{ put("FN","FIRSTNAME"); put("MN","MIDDLENAME"); put("LN","LASTNAME"); put("CT","CITY"); put("ST","STATE"); }};
		Map<String, String> data  = new HashMap <String, String> () {{ put("FN","QUIN"); put("LN","STREET"); put("CT","PUNE"); }};
		//Excpected Output -> Map<String, String> retMap -> {"FIRSTNAME":"QUIN","LASTNAME":"STREET","CITY":"PUNE"}
		
		Map<String, String> retMap=new HashMap<String, String> ();
		for(Map.Entry<String,String>  map1:fields.entrySet()) {
			
			for(Map.Entry<String,String>  map2:data.entrySet()) {
			
			
			if(map1.getKey()==map2.getKey()) {
				retMap.put(map1.getValue(),map2.getValue());
			}
				System.out.println(retMap);
			} 
		}

	}

}
