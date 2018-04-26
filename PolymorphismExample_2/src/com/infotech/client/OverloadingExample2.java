package com.infotech.client;

//2.Method overloading in Java and automatic type conversion
public class OverloadingExample2 {
	 // overloaded Method with 1 int param
	 void overloadedMethod(int i){
	  System.out.println("In overloadedMethod with one int parameter " + i);
	 }
	 
	 // overloaded Method with 2 double params
	 void overloadedMethod(double i, double j){
	  System.out.println("In overloadedMethod with 2 double parameters " + i + " " + j);
	 }
	 
	 
	 public static void main(String args[]){ 
	  OverloadingExample2 overloadingExample2j = new OverloadingExample2();
	  overloadingExample2j.overloadedMethod(5);
	  overloadingExample2j.overloadedMethod(4.7, 111.78);
	  overloadingExample2j.overloadedMethod(50, 100);
	 }
	}
