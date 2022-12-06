package com.variableargdemo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaLastName {

	public static void main(String[] args) {
			//Employee emp=new Employee();
			List<Employee1>ls=new LinkedList<>();
			ls.add(new Employee1(1,"Mayur",5000l));
			ls.add(new Employee1(1,"Shashi",6000l));
			ls.add(new Employee1(1,"sagar",4000l));
			
		
		
		// TODO Auto-generated method stub
	List<String> al=ls.stream().filter(emp->emp.getSalary()>5000).map(emp->emp.getName()).collect(Collectors.toList());
	System.out.println(al);
	int []a={90,12,88,123,30,99};
	Arrays.sort(a);
	int m=a.length-2;
	System.out.println(a[m]);

	}

}
