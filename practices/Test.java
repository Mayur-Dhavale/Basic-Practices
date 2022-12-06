package com.practices;

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog("black");   

		Animal animal = new Animal("White");   

		animal = dog;   

		animal.show("My dog");   

		   

		Animal animal1 = new Animal("White");   

		//Dog d = (Dog)animal1;  
		Animal a=dog;
		
	}

}
