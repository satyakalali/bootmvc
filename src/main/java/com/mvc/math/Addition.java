package com.mvc.math;

import org.springframework.stereotype.Component;

@Component
public class Addition {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {

		return a - b;
	}

	public int exceptionRaise(int a, int b) {

		return a / b;
	}
}
