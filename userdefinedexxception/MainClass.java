package com.userdefinedexxception;

public class MainClass {
	
		public static void main(String[] args) {
			try {
				throw new  MyException("UserDefined Exception");
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			 System.out.println("Exception Caught");
			 
			
			}
		}
		
	}
 
