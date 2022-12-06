package com.democomparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1,"Mayur",27));
		al.add(new Student(3,"Digambar",60));
		al.add(new Student(2,"Anil",35));
		
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.rollno+"-->"+st.name+"-->"+st.age);// Hear output is in ascending order ie sorted 
			                                                            //not according to inserstion order
		}

	}

}
