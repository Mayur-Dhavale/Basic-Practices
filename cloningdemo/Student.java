package com.cloningdemo;

public class Student implements Cloneable {
	
	int rollno;
	String name;
	

	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}


	public static void main(String[] args) {
		try {
		Student s= new Student(1,"Amit");
		
		Student s1=	(Student) s.clone();
		System.out.println(s.rollno+" ==>"+s.name);
		System.out.println(s1.rollno+"==>"+s1.name);
		
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
	}

}
