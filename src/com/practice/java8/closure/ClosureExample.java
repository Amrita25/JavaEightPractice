package com.practice.java8.closure;

public class ClosureExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =10;
		int b=20;
		//whenever any lambda expression is using a variablke in this method's scope (i.e b=20),
		//the java compiler/runtime freezes the value of that variable. 
		//So whenever this lambda expression gets executed outside this method, the value of b will remain same
		//as inside this method.
		doProcess(a, i->System.out.println("inside process "+(i+b)));
		

	}
	
	private static void doProcess(int i,Process p){
		p.process(i);
	}

}
interface Process{
	void process(int i);
}