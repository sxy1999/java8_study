package com.donbest.lambda.tutorial05;

public interface IInvestor {

	default void buyShares() {
		System.out.println("Investor bought shares ...");
	}
	
	default void sellShares() {
		System.out.println("Investor sold shares ...");
	}
}
