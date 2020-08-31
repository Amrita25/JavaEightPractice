package com.practice.java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Unit1Exercise {
	
	public static void printPeopleConditionally(List<Person> people,Condition condition){
		for(Person p : people){
			if(condition.test(p)){
				System.out.println(p);
			}
		}
	}
	public static void printPeopleUsingPredicate(List<Person> people,Predicate<Person> pr,Consumer<Person> cons){
		for(Person p : people){
			if(pr.test(p)){
				cons.accept(p);
			}
		}
	}
	
	public static void main(String [] args){
		List<Person> people = Arrays.asList(new Person("Bruice","Wane",25),
				new Person("Atanu","Mahata",25),
				new Person("Biltu","Baby",30),
				new Person("Puchi","Majumder",28),
				new Person("Caroline","Forbes",25),
				new Person("Damon","Salvator",25));
		
		Collections.sort(people,(person1,person2)->person1.getLname().compareTo(person2.getLname()));
		System.out.println(people);
		
		printPeopleUsingPredicate(people,p->p.getLname().startsWith("S"),s->System.out.println(s));
		printPeopleUsingPredicate(people,p->p.getFname().startsWith("C"),s->System.out.println(s.getFname()));
		
	}

}

interface Condition{
	boolean test(Person p);
}
