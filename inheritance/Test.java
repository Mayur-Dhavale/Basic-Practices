package com.inheritance;

public class Test {
	
	public static void main(String[] args) {
//		B b = new B();// first scenario we can call both variable & method from A & B Class but first check if it is present in B class 
//		b.m1();
//		b.m2();
//		System.out.println(b.b);
		
//		A a=new A();// second scenario we can call only method & variable from parent class that is A 
//		a.m1();
//		System.out.println(a.a); 
		
		A a=new B();//Third scenario everyThink of A class is called (variable & Method) but in B class only overridden methods are called
		a.m1();
		a.m2();
		System.out.println(a.b);
		
//		A a= new A();
//		B b=new B();
//		a=b; // it is equivalent to A a= new B()
//		System.out.println(a.b);
//		a.m2();
		
	//	B b=new A();// This error showes ==>Type mismatch: cannot convert from A to B
		
		
//		A a= new A();
//     	B b=new B();
//	    b=(B)a;// it is equivalent to B b=new B();
//	   

}
}
