package com.cts.hello;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import com.cts.modal.Person;

//Service Implementation
@WebService(endpointInterface = "com.cts.hello.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public List<Person> getAllPersons() {
		ArrayList<Person> users = new ArrayList<Person>();
		Person person1 = new Person("Ankit",23);
		Person person2 = new Person("Ajay",25);
		users.add(person1);
		users.add(person2);
		return users;
	}

}
