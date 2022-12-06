package com.variableargdemo;

public class VariableArgDemo {

	public static void fun(int... a) {

		System.out.println("Number of Arguments==> " + a.length);

		for (int s : a)
			System.out.print(s + " ");
		System.out.println();

	}

	public static void fun2(String s, int... a) {
		System.out.println("String==> " + s);
		System.out.println("Number of Argument==> " + a.length);
		for (int m : a)
			System.out.print(m + " ");
	}
	// public static void fun2(int... s,int...a) {
	// it is not allowed because
	// variablearg always at last
	// //There can be only one variable argument in a method.
	// Variable argument (Varargs) must be the last argument
	// }

	public static void main(String[] args) {

		// fun(1);
		// fun(1,2,3);
		fun2("Mayur", 1, 2, 3);
	}

}
