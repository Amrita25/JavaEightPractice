package com.practice.java8;

public class MyRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside run method");
				
			}
		});
		myThread.run();
		
		Thread lambdaThread = new Thread(()->System.out.println("Inside run method of lambda thread"));
		lambdaThread.run();
	}

}
