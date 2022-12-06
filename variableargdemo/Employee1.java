package com.variableargdemo;

public class Employee1 {
	
	int id; 
	String name;
	Long salary;
	public Employee1() {
		
	}
	
	public Employee1(int id, String name, Long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	

}
