package com.userdefinedexxception;

public class TryCatchDemo {
	
	static int m1() {
		try {
			return 1;
		}
		catch(Exception EX){
			return 2;
		}finally {
			return 3;
		}
	}

	public static void main(String[] args) {
	
		System.out.println(m1());

	}

}
