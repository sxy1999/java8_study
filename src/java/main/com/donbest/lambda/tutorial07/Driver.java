package com.donbest.lambda.tutorial07;

public class Driver {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Factory factory = new Factory();

		IShape circle = factory.getObject(() -> new Circle());
		IVehicle car = factory.getObject(() -> new Car());
		
	}

}
