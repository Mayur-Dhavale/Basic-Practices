package com.userdefinedexxception;

public class UnderAgeException extends Exception{
	
public	UnderAgeException(){
		super("You are Under Age");
	}
public	UnderAgeException(String massage) {
	super(massage);
}

	
}

