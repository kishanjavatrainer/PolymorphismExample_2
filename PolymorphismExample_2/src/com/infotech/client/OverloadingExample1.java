package com.infotech.client;

//1.Example of method overloading in Java
public class OverloadingExample1 {
	// Method with 1 int param
	void overloadedMethod(int i) {
		System.out.println("In overloadedMethod with one int parameter " + i);
	}

	// Method with 2 int params
	void overloadedMethod(int i, int j) {
		System.out.println("In overloadedMethod with 2 int parameters " + i
				+ " " + j);
	}

	// Method with 1 double param
	void overloadedMethod(double i) {
		System.out.println("In overloadedMethod with 1 double parameter " + i);
	}

	public static void main(String args[]) {
		OverloadingExample1 overloadingExample1 = new OverloadingExample1();
		overloadingExample1.overloadedMethod(5);
		overloadingExample1.overloadedMethod(5.7);
		overloadingExample1.overloadedMethod(5, 10);
	}
}