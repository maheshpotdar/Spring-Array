package com.mahesh.mainApp;

import java.awt.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mahesh.model.Car;
import com.mahesh.model.Person;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/mahesh/resources/spring.xml");

		Person person = (Person) context.getBean("p1");
		System.out.println("Hello," + person.getName());
		System.out.println(person.getAddress());

		Car[] cars = person.getCars();

		for (Car car : cars) {
			System.out.println(car);
		}

	}
}
