package com.donbest.lambda.tutorial04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo<T> {
	public List<T> testPredicate(Predicate<T> p, List<T> list) {
		List<T> returnList = new ArrayList<>();
		for (T i : list) {
			if (p.test(i))
				returnList.add(i);
		}
		return returnList;
	}

	public List<T> testPredicateNegate(Predicate<T> p, List<T> list) {
		List<T> returnList = new ArrayList<>();
		for (T i : list) {
			if (p.negate().test(i))
				returnList.add(i);
		}
		return returnList;
	}

	public List<T> testPredicateOr(Predicate<T> p1, Predicate<T> p2, List<T> list) {
		List<T> returnList = new ArrayList<>();
		for (T i : list) {
			if (p1.or(p2).test(i))
				returnList.add(i);
		}
		return returnList;
	}
	
	public List<T> testPredicateAnd(Predicate<T> p1, Predicate<T> p2, List<T> list) {
		List<T> returnList = new ArrayList<>();
		for (T i : list) {
			if (p1.and(p2).test(i))
				returnList.add(i);
		}
		return returnList;
	}
}
