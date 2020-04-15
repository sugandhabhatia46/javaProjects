package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {

		int[] marks = { 99, 98, 95, 93, 90 };
		Student student = new Student("Sugandha", marks);
		int number = student.getNumberOfMarks();
		System.out.println("number of marks is " + number);
		int sum = student.getTotalSumOfMarks();
		System.out.println("Total sum of marks is " + sum);
		int maximumMark = student.getMaximumMark();
		System.out.println("Maximum of marks is " + maximumMark);
		int minimumMark = student.getMinimumMark();
		System.out.println("Minimum of marks is " + minimumMark);
		BigDecimal average = student.getAverageMarks();
		// TODO Auto-generated method stub

	}

}
