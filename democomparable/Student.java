package com.democomparable;

public class Student implements Comparable<Student> {
	
	int rollno;
	String name;
	int age;
	
	
	

	public Student(int rollno, String name, int age) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}




	@Override
	public int compareTo(Student st) {
		// this method is applicable to compare according to one variable
		if(age==st.age)
			return 0;
		if(age>st.age)
			return 1;
		else
			return -1;
	}
	

	

}
