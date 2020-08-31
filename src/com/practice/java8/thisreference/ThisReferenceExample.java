package com.practice.java8.thisreference;

public class ThisReferenceExample {
	
	public String toString(){
		return "Inside ThisReferenceExample class";
	}
	
	public void doProcess(int i, MyProcess p){
	  p.process(i);
	}
	//"This" reference inside lambda expression actually points to the main class.
	public void execute(){
		doProcess(23,i->{System.out.println("The value of i is "+i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisReferenceExample obj = new ThisReferenceExample();
		/**Whenever "This" reference is used inside a method 
		 * in an annonymus inner class,it always points to the reference of the annonymus inner class
		 */
		obj.doProcess(10, new MyProcess(){

			@Override
			public void process(int num) {
				// TODO Auto-generated method stub
				System.out.println("Value of number is "+num);
				System.out.println(this);
			}
			
			public String toString(){
				return "Inside annonymus inner class";
			}
			
		});
		
		//obj.doProcess(23,i->{System.out.println("The value of i is "+i);
		//System.out.println(this); This will not work
		//});
		
		obj.execute();
	}

}
