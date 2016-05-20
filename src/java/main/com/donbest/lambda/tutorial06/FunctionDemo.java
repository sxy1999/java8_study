package com.donbest.lambda.tutorial06;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

	public <T, R> List<R> applyFunction(Function<T, R> function, List<T> list) {
		List<R> returnList = new ArrayList<>();
		list.forEach(x -> returnList.add(function.apply(x)));
		return returnList;
	}

	public <T, R> List<R> applyFunctionThen(Function<T, R> function1, Function<R, R> function2, List<T> list) {
		List<R> returnList = new ArrayList<>();
		list.forEach(x -> returnList.add(function1.andThen(function2).apply(x)));
		return returnList;
	}

	public <T, R> List<R> applyFunctionCompose(Function<R, R> function1, Function<T, R> function2, List<T> list) {
		List<R> returnList = new ArrayList<>();
		list.forEach(x -> returnList.add(function1.compose(function2).apply(x)));
		return returnList;
	}
}
