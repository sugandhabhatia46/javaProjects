package com.in28minutes.Oops.level2;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Object Oriented Programming Level 2", "Sugandha");
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(10, "Excellent", 4));

		System.out.println(book);

	}

}
