package com.superthisdemo;

public class Child extends Parent {
	
	int a=10;
	
	public Child() {
		super();
		System.out.println("I am in Child-Constructor");
		//super();// its not allowed 
	}
	void m1() {
		
		 System.out.println(this.a);
		 
		 System.out.println(super.a);
		
		 System.out.println("Methods in child class");
		 super.m1();
	}

	public static void main(String[] args) {
		Parent c= new Child();
		c.m1();
		
		
	
	}
}
