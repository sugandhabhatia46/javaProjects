package com.in28minutes.exerciseLoops;

public class MyNumberRunner {
	
	public static void main (String[] args) {
		
		MyNumber number = new MyNumber(37);
		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);
		int sum = number.sumUptoN();
		int sumOfDivisors = number.sumOfDivisors();
		number.printANumberTable();
		
	}

}
