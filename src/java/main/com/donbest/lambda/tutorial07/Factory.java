package com.donbest.lambda.tutorial07;

import java.util.function.Supplier;

public class Factory {
//	public IShape getShape(Supplier<? extends IShape> supplier) {
//		IShape shape = supplier.get();
//		System.out.println(shape + " was created...");
//		return shape;
//	}
//
//	public IVehicle getVehicle(Supplier<? extends IVehicle> supplier) {
//		IVehicle vehicle = supplier.get();
//		System.out.println(vehicle + " was created...");
//		return vehicle;
//	}
	public <T> T getObject(Supplier<? extends T> supplier) {
		T t = supplier.get();
		System.out.println(t + " was created...");
		return t;
	}
}
