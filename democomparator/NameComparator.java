package com.democomparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
	
	
	public int compare(Student s1,Student s2){  
		return s1.name.compareTo(s2.name);  
		}  

//	@Override
//	public int compare(Student s1, Student s2) {
//	
//		if(s1.name==s2.name)
//		return 0;
//		if(s1.name>s2.name) /// this logic is wrong because we can not use > operator to string.
//			return 1;
//		else 
//			return -1;
//		
//	}

	
}
