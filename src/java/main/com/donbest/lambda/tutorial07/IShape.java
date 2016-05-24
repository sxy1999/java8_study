package com.donbest.lambda.tutorial07;

public interface IShape {
	public void sketch();
}

class Rectangle implements IShape {
	@Override
	public void sketch() {
		System.out.println("Rectangle.sketch() method is invoked...");
	}

	@Override
	public String toString() {
		return "Rectangle";
	}
}

class Triangle implements IShape {
	@Override
	public void sketch() {
		System.out.println("Triangle.sketch() method is invoked...");
	}
	
	@Override
	public String toString() {
		return "Triangle";
	}
}

class Circle implements IShape {
	@Override
	public void sketch() {
		System.out.println("Circle.sketch() method is invoked...");
	}

	@Override
	public String toString() {
		return "Circle";
	}
}
