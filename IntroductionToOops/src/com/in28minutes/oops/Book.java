package com.in28minutes.oops;

public class Book {

	// state
	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		if (noOfCopies > 0) {
			this.noOfCopies = noOfCopies;
		}
	}

	public void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies + howMuch);

	}

	public void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies - howMuch);
	}

}
