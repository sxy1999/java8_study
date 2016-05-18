package com.donbest.lambda.tutorial01;

public class DoSomething implements IDoSomething, IDoSomething2 {

	@Override
	public void doSomething() {
		System.out.println("Do something ...");
	}

	@Override
	public void doSomeOtherThing() {
		IDoSomething.super.doSomeOtherThing();
	}

	public static void main(String[] args) {
		IDoSomething doSomething = new DoSomething();
		doSomething.doSomething();
		doSomething.doSomeOtherThing();

		IDoSomething2 soSomething2 = new IDoSomething2() {

			@Override
			public void doSomething() {
				System.out.println("do something 2 invoked!");
			}
		};

		soSomething2.doSomething();

		IDoSomething2 s3 = () -> {
			System.out.println("do something 3 invoked!");
			System.out.println("do something 4 invoked!");
			};
		s3.doSomething();
	}
}
