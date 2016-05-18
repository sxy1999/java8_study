package com.donbest.lambda.tutorial04;

import java.util.Arrays;
import java.util.List;

public class Drive {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
		List<String> stringList = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight");
		List<Object> objectList = Arrays.asList(new String("one"), new String("two"), new StringBuffer("three"));

		PredicateDemo<Integer> pd01 = new PredicateDemo<Integer>();
		System.out.println("All #s: " + pd01.testPredicate((x) -> true, integerList));
		System.out.println("All even #s: " + pd01.testPredicate((x) -> (x & 1) == 0, integerList));
		System.out.println("All odd #s: " + pd01.testPredicate((x) -> (x & 1) == 1, integerList));

		System.out.println("-------------------------------------------------------------------------");

		PredicateDemo<String> pd02 = new PredicateDemo<String>();
		System.out.println("All strings: " + pd02.testPredicate((x) -> true, stringList));
		System.out.println("All 'ee' strings: " + pd02.testPredicate((x) -> x.contains("ee"), stringList));
		System.out.println("All 't' strings: " + pd02.testPredicate((x) -> x.contains("t"), stringList));

		System.out.println("-------------------------------------------------------------------------");

		PredicateDemo<Object> pd03 = new PredicateDemo<Object>();
		System.out.println("All objects: " + pd03.testPredicate((x) -> true, objectList));
		System.out.println("All strings: " + pd03.testPredicate((x) -> x instanceof String, objectList));
		System.out.println("All stringBuffers: " + pd03.testPredicate((x) -> x instanceof StringBuffer, objectList));
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Negate #s: " + pd01.testPredicateNegate((x) -> true, integerList));
		System.out.println("Negate even #s: " + pd01.testPredicateNegate((x) -> (x & 1) == 0, integerList));
		System.out.println("Negate odd #s: " + pd01.testPredicateNegate((x) -> (x & 1) == 1, integerList));
		
		System.out.println("-------------------------------------------------------------------------");
		System.out.println("Even or odd #s: " + pd01.testPredicateOr((x) -> (x & 1) == 0, (x) -> (x & 1) == 1, integerList));
		System.out.println("Even and odd #s: " + pd01.testPredicateAnd((x) -> (x & 1) == 0, (x) -> (x & 1) == 1, integerList));
		
	}

}
