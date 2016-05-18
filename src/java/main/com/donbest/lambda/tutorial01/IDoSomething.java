package com.donbest.lambda.tutorial01;

@FunctionalInterface
public interface IDoSomething {
	public void doSomething();
	
	public int hashCode();
	public boolean equals(Object obj);
	public default void doSomeOtherThing() {
		System.out.println("Do some other thing ...");
	}
}
