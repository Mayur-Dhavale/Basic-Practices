package com.java8feactures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Student> li=new ArrayList<Student>();
      
      li.add(new Student(1,"Mayur",80));
      li.add(new Student(2,"Shashi",90));
      li.add(new Student(1,"Annand",85));
      
    Optional<Student> li1 =li.stream().sorted(Comparator.comparingInt(Student::getMarks).reversed()).skip(2).findFirst();
    
     System.out.println(li1.get().toString());
     
   List<Student> list= li.stream().filter(s->(s.getName()=="Shashi"||s.getMarks()==80)).collect(Collectors.toList());
   System.out.println(list);
	}

}
 