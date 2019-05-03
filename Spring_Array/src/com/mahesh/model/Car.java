package com.mahesh.model;

public class Car {

	private String carName;

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Car(String carName) {
		super();
		this.carName = carName;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + "]";
	}

}
