package com.donbest.lambda.tutorial08;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	<T> List<T> applyFunction(UnaryOperator<T> unaryOperator, List<T> list) {
		List<T> resultList = new ArrayList<>();
		list.forEach(x->resultList.add(unaryOperator.apply(x)));
		return resultList;
	}
}
