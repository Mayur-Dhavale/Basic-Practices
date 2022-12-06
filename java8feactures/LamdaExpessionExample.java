package com.java8feactures;

public class LamdaExpessionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LamdaExpressionInterface le=(name)->{
			return "Hello"+ name;
		};
		System.out.println(le.say("  Mayur"));
		

	}

}
