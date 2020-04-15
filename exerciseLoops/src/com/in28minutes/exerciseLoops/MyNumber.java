package com.in28minutes.exerciseLoops;

public class MyNumber {

	private int number;

	public MyNumber(int number) {

		this.number = number;
	}

	public boolean isPrime() {
		
		if (number == 1 || number == 2) {
			
			return true;
		}
		for (int i = 2; i <= number/2; i++) {
		
			if (number % i == 0 ) {
				return false;
				
			}
			
			
		}
		return true;
	}

	public int sumUptoN() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int sumOfDivisors() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void printANumberTable() {
		// TODO Auto-generated method stub

	}

}
