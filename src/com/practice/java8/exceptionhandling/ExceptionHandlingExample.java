package com.practice.java8.exceptionhandling;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
	
	public static void main(String [] args){
		int[] someNumbers = {2,3,4,5};
		int key=0;
		process(someNumbers,key,wrapperLambda((i,j)->System.out.println(i/j)));
		
	}
	private static void process(int[] somenums,int key,BiConsumer<Integer, Integer> consumer){
		for(int i:somenums){
			consumer.accept(i, key);
		}
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		
		return (i,j)->{
			try{
			consumer.accept(i, j);
			}catch(ArithmeticException e){
				System.out.println("ArithmeticException occurred !!!");
			}
		};
		
	}
	

}
