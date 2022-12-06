package com.recoursiondemo;

public class RecoursionTest {
	
	// Recursion is  calling of method again itself & gives stackoverflow error.
	
	public static void hello() {
		
		System.out.println(" Hello i am in Hello method...");
		hello();
	}


	public static void main(String[] args) {
		
		hello();
	}

}
