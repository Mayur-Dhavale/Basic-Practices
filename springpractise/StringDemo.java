package com.springpractise;

public class StringDemo {

	public static void main(String[] args) {
		 String s= "javabykiran";
		 String s3= "javaBykiran";
		 System.out.println(s);
		 String s1= s.concat("pune");
		 System.out.println(s1);
		  char s4 =s.charAt(1);
		  System.out.println(s4);
		int ct =s.compareTo("mayurdhavale");
		System.out.println(ct);
		System.out.println(s.contains("by"));
        System.out.println(s.endsWith("ran"));
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s3));// Only check contain not check lower and upper
        System.out.println( s.indexOf("ki"));  
        System.out.println(s.indexOf('v')); 
        System.out.println(s.join("/", "27","9","19194"));
        System.out.println(s.length());
        System.out.println(s.replace("a","e"));
        System.out.println(s.toUpperCase());
      
	}

}
