package com.in28minutes.arrays;

import java.math.BigDecimal;

public class Student {

	private String name;
	private int[] marks;

	public Student(String name, int[] marks) {
		
		this.name = name;
		this.marks = marks;
		
	}

	public int getNumberOfMarks() {
	
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark:marks) {
			sum = sum + mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		int max = 0;
		for (int mark : marks) {
			if (mark > max) {
				max = mark;
			}
		}
		
		return max;
	}

	public int getMinimumMark() {
		int min = 101;
		for (int mark : marks) {
			if (mark < min) {
				min = mark;
			}
		}
		
		return min;
	}

	public BigDecimal getAverageMarks() {
		// TODO Auto-generated method stub
		return null;
	}

}
