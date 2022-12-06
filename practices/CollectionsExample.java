package com.practices;

import java.util.ArrayList;
import java.util.List;

public class CollectionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		
		List<Integer> li2=new ArrayList<Integer>();
		li2.add(5);
		li2.add(6);
		li2.add(7);
		li2.add(8);
		if(li.size()%2==0) {
			li.addAll(li2.add(li2.forEach(p->System.out.println(p))));
		}
			
		

		for(Integer list:li) {
			
				
			}
		}



	}

}
