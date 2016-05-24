package com.donbest.lambda.tutorial07;

public interface IShape {
	void sketch();
}

class rectangle implements IShape {

	@Override
	public void sketch() {
		System.out.println("Rectangle.sketch() method invoked...");
	}

	@Override
	public String toString() {
		return "Rectangle";
	}

}

class Triangle implements IShape {

	@Override
	public void sketch() {
		System.out.println("Triangle.sketch() method invoked...");
	}

	@Override
	public String toString() {
		return "Triangle";
	}
}

class Circle implements IShape {

	@Override
	public void sketch() {
		System.out.println("Circle.sketch() method invoked...");
	}

	@Override
	public String toString() {
		return "Circle";
	}
}
