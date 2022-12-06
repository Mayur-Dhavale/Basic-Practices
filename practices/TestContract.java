package com.practices;

import java.util.HashMap;
import java.util.Map;

public class TestContract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, String> hm= new HashMap<>();
		
		Employee e1=new Employee(1,"mayur");
		Employee e2=new Employee(1,"mayur");
		
		hm.put(e1,"suraj");
		hm.put(e2,"mayur");
		
		System.out.println(hm.size());
		
		System.out.println(hm.toString());

	}

}
