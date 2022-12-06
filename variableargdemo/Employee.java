package com.variableargdemo;

import java.util.List;
import java.util.stream.Collectors;

public class Employee {

		String name;
		int salary;
		List<String> contactNumber;
	

	public static void main(String[] args) {
		List<Employee> employees = //DAO layer;
			List<String> contactNumbers = ?;
		
		List<String> contactNumbers=employees.stream().filter(emp->emp.contactNumber).collect(Collectors.toList());
		
		
		
	}
		
	}

