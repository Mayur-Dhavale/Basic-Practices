
package com.collectionbasics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Employee {
	
	
	int id;
	String name;
	String language;
	String mode;
	
	public  Employee() {
	}
	
		
	

	public Employee(int id, String name, String language, String mode) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.mode = mode;
	}




	public static void main(String[] args) {
		
		Employee s1=new Employee(1,"ravi","english","read");
		Employee s2=new Employee(2,"vinod","tamil","write");
		Employee s3=new Employee(3,"ravi","tamil","read");
		Employee s4=new Employee(4,"kumar","telugu","write");
		Employee s5=new Employee(5,"ravi","english","read");
		Employee s6=new Employee(6,"vinod","tamil","read");
//		HashMap<Employee,String> hm =new HashMap<>();
//		hm.put(s1, ":");
		List<Employee> list=new LinkedList<Employee>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
		for(Employee e:list) {
			System.out.println(e.id+" "+e.language+" "+e.mode+" "+e.name);
		}
		
//		Stream<	Employee> Filter_data=list.stream().filter(e->e.id>4);
//		
//		Filter_data.forEach((Employee)->{
//			System.out.println(Employee.id+" "+Employee.language+" "+Employee.mode+" "+Employee.name);
//		});
//		
		//System.out.println(list);
//		Iterator<Employee> itr=list.iterator();
//		while(itr.hasNext()) {
//			
//		  Employee e=itr.next();
//		  
//			System.out.println(e.id);
//			System.out.println(e.language);
//			System.out.println(e.mode);
//			System.out.println(e.name);
//		}
		}
		
		

	}


