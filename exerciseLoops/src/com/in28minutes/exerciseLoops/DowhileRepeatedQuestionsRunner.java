package com.in28minutes.exerciseLoops;

import java.util.Scanner;

public class DowhileRepeatedQuestionsRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int number = -1;

		do {
			if (number != -1) {
				System.out.println("Cube is " + (number * number * number));
			}
			System.out.print("Enter a Number: ");
			number = scanner.nextInt();
		} while (number > 0);
		System.out.println("Thank You! Have Fun!");

	}

}
