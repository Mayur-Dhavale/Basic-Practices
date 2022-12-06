package com.practices;

public class MyClass {

	public static void main(String[] args) {
		int count = 0;
		String s="aaabbacc";
	    char []a=s.toCharArray();
	    
	    for (int i = 0; i < a.length; i++) {
			
		
	    	if(a[i]==a[i+1]) {
	    		
	    		count++;
	    	}
	    	System.out.println(a[i]+"--->"+count);
			
		}

	}

}
