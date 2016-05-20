package com.donbest.lambda.tutorial06;

import java.util.Arrays;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0, 1, 2, 3, 4, 5, 6);
		FunctionDemo fd = new FunctionDemo();
		System.out.println("x as Double ========>" + fd.applyFunction(x -> new Double(x), list));
		System.out.println("x*0.5 as Double ========>" + fd.applyFunction(x -> new Double(x * 0.5), list));
		System.out.println("andThen ==> (x + x) * (x + x)===>" + fd.applyFunctionThen(x -> new Double(x) + new Double(x), x -> new Double(x) * new Double(x), list));
		System.out.println("compose ==> (x * x) + (x * x)===>" + fd.applyFunctionCompose(x -> new Double(x) + new Double(x), x -> new Double(x) * new Double(x), list));
		System.out.println("---------------------------------------------------------");
		System.out.println("x as Float ========>" + fd.applyFunction(x -> new Float(x), list));
		System.out.println("x*0.6 as Float ========>" + fd.applyFunction(x -> new Float(x * 0.6), list));
	}

}
