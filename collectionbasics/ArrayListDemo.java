package com.collectionbasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(30);
		al.add(30);// duplicates allow
		al.add(40);
		al.add(50);

		// System.out.println(al);// maimtains insertion order

		System.out.println("========Iterating By Iterator=========");
		//Iterator<Integer> itr=al.iterator();
		ListIterator<Integer> li = al.listIterator();
		System.out.println("forward");
		while (li.hasNext()) {
			Integer element = (Integer) li.next();
			System.out.println(element);
		}

		System.out.println("========Iterating By BackWord list Iterator=========");

		while (li.hasPrevious()) {
			Integer elements = (Integer) li.previous();
			System.out.println(elements);
		}

	}

}
