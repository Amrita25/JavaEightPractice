package com.practice.java8.methodreference;

public class MethodReferenceExample1 {
	
	
	public static void printMsg(){
		System.out.println("Printing message");
	}

	public static void main(String[] args) {
	
		
		Thread th = new Thread(MethodReferenceExample1::printMsg);// == ()->method()
		th.start();

	}

}
