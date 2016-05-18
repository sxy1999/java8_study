package com.donbest.lambda.tutorial05;

public interface IEmployee {

	default void signIn() {
		System.out.println("Employee signed in ...");
	}
	
	default void signOut() {
		System.out.println("Employee signed out ...");
	}
}
