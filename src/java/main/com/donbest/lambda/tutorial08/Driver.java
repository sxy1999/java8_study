package com.donbest.lambda.tutorial08;

import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		UnaryOperatorDemo unaryOperatorDemo = new UnaryOperatorDemo();
		System.out.println("x =========> " + unaryOperatorDemo.applyFunction(x -> x, list));
		System.out.println("x*5 =========> " + unaryOperatorDemo.applyFunction(x -> x * 5, list));
	}

}
