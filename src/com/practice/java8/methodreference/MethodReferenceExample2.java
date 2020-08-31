package com.practice.java8.methodreference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.practice.java8.Person;

public class MethodReferenceExample2 {
	
	public static void printPeopleUsingPredicate(List<Person> people,Predicate<Person> pr,Consumer<Person> cons){
		for(Person p : people){
			if(pr.test(p)){
				cons.accept(p);
			}
		}
	}

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Bruice","Wane",25),
				new Person("Atanu","Mahata",25),
				new Person("Stefan","Salvator",30),
				new Person("Puchi","Majumder",28),
				new Person("Caroline","Forbes",25),
				new Person("Damon","Salvator",25));
		
		Collections.sort(people,(person1,person2)->person1.getLname().compareTo(person2.getLname()));
		//System.out.println(people);
		
		printPeopleUsingPredicate(people,p->true,System.out::println);//p->method(p)
	}

}
