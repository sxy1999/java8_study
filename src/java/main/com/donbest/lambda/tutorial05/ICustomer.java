package com.donbest.lambda.tutorial05;

public interface ICustomer {

	default void buySomething() {
		System.out.println("Customer bought something ...");
	}
}
