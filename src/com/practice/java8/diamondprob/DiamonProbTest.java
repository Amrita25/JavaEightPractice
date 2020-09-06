package com.practice.java8.diamondprob;

public class DiamonProbTest implements LeftInterface,RightInterface{
	
	@Override
	public void mymethod(){
		LeftInterface.super.mymethod();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DiamonProbTest obj = new DiamonProbTest();
		obj.mymethod();

	}

}
