package com.userdefinedexxception;

public class Voting {

	public static void main(String[] args) throws UnderAgeException {
		// TODO Auto-generated method stub
		int age=17;
		
		if(age<18) {
			throw new UnderAgeException();
		}
		else {
			System.out.println("YOU CAN VOTING");
		}

	}

}
 