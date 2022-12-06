package com.garbagecollectiondemo;

public class GarbageCollectionTest {
	
	public void finalize() {
		
		System.out.println("Finalize method cleans all used object...");
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		GarbageCollectionTest obj1=new GarbageCollectionTest();
		GarbageCollectionTest obj2=new GarbageCollectionTest();
		obj1=null;
		obj2=null;
		System.gc();
	}

}
