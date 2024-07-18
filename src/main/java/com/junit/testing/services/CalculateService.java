package com.junit.testing.services;

public class CalculateService {

	public static int sumTwoNumber(int a, int b) {
		return a + b;
	}

	public static int minusTwoNumber(int a, int b) {
		return a - b;

	}

	public static double divideTwoNumber(int a, int b) {
		return a / b;
	}

	public static int multiplyTwoNumber(int a, int b) {
		return a * b;
	}

	public static int sumOfAnyNumber(int... numbers) {

		int sum = 0;

		for (int el : numbers) {
			sum += el;
		}
		return sum;

	}

}
