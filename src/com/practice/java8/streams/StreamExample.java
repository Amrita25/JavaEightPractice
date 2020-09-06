package com.practice.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.practice.java8.Person;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> people = Arrays.asList(new Person("Bruice","Wane",25),
				new Person("Atanu","Mahata",25),
				new Person("Stefan","Salvator",30),
				new Person("Puchi","Majumder",28),
				new Person("Puchi","Majumder",28),
				new Person("Caroline","Forbes",25),
				new Person("Damon","Salvator",25));
		people.stream().filter(p->p.getLname().startsWith("S"))
		.forEach(p->System.out.println(p));
		
		long count = people.stream().filter(p->p.getLname().startsWith("S"))
					.count();
		System.out.println(count);
		
		//using parallel stream '
		long count1=people.parallelStream().filter(p->p.getLname().startsWith("S"))
		.count();
		//distinct method 
		long count2 =people.stream().distinct().count();
		//map()
		
		List<String> fnameList = people.stream().distinct().map(person->person.getFname()).collect(Collectors.toList());
		System.out.println("fnameList list values are : "+fnameList);
		System.out.println("count2 - "+count2);

	}

}
