package com.practice.java8.diamondprob;

public interface LeftInterface {
	
	default void mymethod(){
		System.out.println("inside left interface");
	}

}
