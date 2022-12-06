package com.democomparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {

	public static void main(String[] args) {
	
		ArrayList<Student> al= new ArrayList<>();
		al.add(new Student(1, "Mayur", 27));
		al.add(new Student(2, "Sagar", 28));
		al.add(new Student(3, "Amol", 30));
		
		// sorting by age
		System.out.println("Sorting By AGE");
		Collections.sort(al,new AgeComparator());
		for(Student st:al) {
			System.out.println(st.rollno+"-->"+st.name+"-->"+st.age);
		}
		System.out.println("Sorting By NAME");
		Collections.sort(al, new NameComparator());
		for(Student st:al) {
			System.out.println(st.rollno+"-->"+st.name+"-->"+st.age);
		}

	}

}
