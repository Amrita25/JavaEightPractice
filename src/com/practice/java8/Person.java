package com.practice.java8;

public class Person {
	
	private String fname;
	private String lname;
	private int age;
	
	public Person(String fname, String lname, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString(){
		return fname+" "+lname+" Age : "+age;
		
	}
	@Override
	public boolean equals(Object obj){
		if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Person othr =(Person)obj;
		return this.fname.equals(othr.getFname()) && this.lname.equals(othr.getLname());
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fname.hashCode();
		result = prime * result + lname.hashCode();
		return result;
	}

}
