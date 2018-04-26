package com.infotech.client;
//3.Overloaded method in case of Inheritance
class Parent {
	private int i;
	// Constructor
	Parent(int i) {
		this.i = i;
	}
	// Method with no param
	public void dispayData() {
		System.out.println("Value of i " + i);
	}
}

class Child extends Parent {
	private int j;
	// Constructor
	Child(int i, int j) {
		// Calling parent class constructor
		super(i);
		this.j = j;
	}
	// Overloaded Method with String param
	public void dispayData(String showMsg) {
		System.out.println(showMsg + "Value of j " + j);
	}
}

public class OverloadingExample3 {
	public static void main(String args[]) {
		Child child = new Child(5, 10);
		// This call will invoke the child class method
		child.dispayData("in Child class displayData ");
		// This call will invoke the parent class method
		child.dispayData();
	}
}
