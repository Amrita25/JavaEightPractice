package com.practice.java8;

public class TypeInferenceExample {
	
	public static void printLambda(StringLengthLambda lambda,String s){
		System.out.println(lambda.getLength(s));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringLengthLambda myLambda = s->s.length();
		printLambda(s->s.length(),"Hello  World");

	}
	
	

}

interface StringLengthLambda{
	int getLength(String s);
}

