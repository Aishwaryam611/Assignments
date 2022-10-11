package com.lambdaAssignments;

import java.util.function.UnaryOperator;

public class ReplaceToUpperCase implements UnaryOperator<String> {
	public String apply(String str) {
		return str.toUpperCase();
	}

}
