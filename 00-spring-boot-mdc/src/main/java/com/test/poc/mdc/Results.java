package com.test.poc.mdc;

public class Results {
	int firstNumber;
	int secondNumber;
	int sum;

	public Results(int firstNumber, int secondNumber, int sum) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		this.sum = sum;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public int getSum() {
		return sum;
	}

}
