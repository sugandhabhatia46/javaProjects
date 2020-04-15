package com.in28minutes.Oops.level2;

public class Rectangle {

	// state
	private int length;
	private int width;

	// constructor
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// method
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	// area
	public int Area() {
		return length * width;
	}


	// perimeter
	public int Perimeter() {
		return 2 * (length + width);
	}

	// toString
	@Override
	public String toString() {
		return String.format("length - %d, width - %d, Area - %d, Perimeter - %d,", length, width, Area(), Perimeter());
	}

}
