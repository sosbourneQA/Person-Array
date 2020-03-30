package com.qa.main;

import java.util.ArrayList;
import java.util.List;

public class ListPerson {

	private List<Person> personList = new ArrayList<>();

	public boolean addPerson(String name, int age, String job_title) {
		return this.personList.add(new Person(name, age, job_title));
	}

	public Person findPerson(String name) {
		for (Person p : personList) {
			if (p.getName().equals(name)) {
				return p;
			}
		}
		return null;
	}

	public void showList() {
		for (int i = 0; i < personList.size(); i++) {
			System.out.println(personList.get(i).toString());
		}
	}

}
