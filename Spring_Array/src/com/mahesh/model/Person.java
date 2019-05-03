package com.mahesh.model;

import java.util.Arrays;

public class Person {

	private String name;
	private String address;

	private Car[] cars;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String address, Car[] cars) {
		super();
		this.name = name;
		this.address = address;
		this.cars = cars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", cars=" + Arrays.toString(cars) + "]";
	}

}
