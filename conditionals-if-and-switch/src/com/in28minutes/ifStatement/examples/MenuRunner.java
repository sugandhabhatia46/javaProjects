package com.in28minutes.ifStatement.examples;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		int number1 = scanner.nextInt();

		System.out.println("The Number you Entered is - " + number1);

		System.out.print("Enter Number 2: ");
		int number2 = scanner.nextInt();
		System.out.println("The Number you Entered is - " + number2);

		System.out.println("1 - Add");
		System.out.println("2 - Subtract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");
		System.out.println("Choose Operation: ");
		int operation = scanner.nextInt();

		System.out.println("Number 1 - " + number1);
		System.out.println("Number 2 - " + number2);
		System.out.println("Choice - " + operation);

		performOperationsUsingNestedIfElse(number1, number2, operation);

	}

	private static void performOperationsUsingNestedIfElse(int number1, int number2, int operation) {
		if (operation == 1) {
			System.out.println(number1 + number2);
		} else if (operation == 2) {
			System.out.println(number1 - number2);
		} else if (operation == 3) {
			System.out.println(number1 / number2);
		} else if (operation == 4) {
			System.out.println(number1 * number2);
		} else {
			System.out.println("Invalid Choice");
		}
	}

}
