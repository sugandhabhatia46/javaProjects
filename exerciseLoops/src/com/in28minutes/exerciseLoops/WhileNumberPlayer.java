package com.in28minutes.exerciseLoops;

public class WhileNumberPlayer {

	private int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;

	}

	public void printSquareUptoLimit() {
		int i = 1;
		while (i * i < limit) {
			// body of the code
			System.out.println(i * i + " ");
			// increament
			i++;
		}

	}

	public void printCubesUptoLimit() {
		int i = 1;
		while (i * i * i < limit) {
			// body of the code
			System.out.println(i * i * i + " ");
			// increament
			i++;

		}
	}

}
