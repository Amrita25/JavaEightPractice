package com.practice.java8.collectioniteration;

import java.util.Arrays;
import java.util.List;

import com.practice.java8.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Bruice","Wane",25),
				new Person("Atanu","Mahata",25),
				new Person("Stefan","Salvator",30),
				new Person("Puchi","Majumder",28),
				new Person("Caroline","Forbes",25),
				new Person("Damon","Salvator",25));
		people.forEach(p->System.out.println(p.getFname()));

	}

}
