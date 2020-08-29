package com.practice.java8;

public class Greeter {
	
	public void greet(Greeting greeting){
		greeting.perform();
	}
	
	
	public static void main(String[] args){
		Greeter greeter = new Greeter();
		Greeting gr = new HelloWorldGreeting();
		greeter.greet(gr);
		
		Greeting myLambdaFunc = ()->System.out.println("Hello World");
		myLambdaFunc.perform();
	}

}
