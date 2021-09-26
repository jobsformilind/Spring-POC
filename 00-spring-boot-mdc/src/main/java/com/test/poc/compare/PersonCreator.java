package com.test.poc.compare;

import java.util.Arrays;
import java.util.List;

public class PersonCreator {
	public static List<Person> getPersons() {
		return Arrays.asList(
				new Person("John", Gender.MALE, 30),
				new Person("John", Gender.MALE, 322),
				new Person("Kevin", Gender.MALE, 20),
				new Person("Sara", Gender.FEMALE, 25),
				new Person("Sara", Gender.FEMALE, 38),
				new Person("Dave", Gender.MALE, 33),
				new Person("Paula", Gender.FEMALE, 25),
				new Person("Jack", Gender.MALE, 40),
				new Person("Jack", Gender.MALE, 33),
				new Person("Jenny", Gender.FEMALE, 35)
		);
	}

	public static Person getMalePerson(String name, int age) {
		return  new Person(name, Gender.MALE, age);
	}
	public static Person getFemalePerson(String name, int age) {
		return  new Person(name, Gender.FEMALE, age);
	}

}
