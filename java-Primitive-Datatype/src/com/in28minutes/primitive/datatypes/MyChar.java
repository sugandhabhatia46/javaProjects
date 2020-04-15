package com.in28minutes.primitive.datatypes;

public class MyChar {

	private char ch;

	MyChar(char ch) {
		// state
		this.ch = ch;

	}

	public boolean isVowel() {
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			return true;
		}

		return false;
	}

	public boolean isConsonent() {
		if (ch == 'b' || ch == 'c' || ch == 'd' || ch == 'f' || ch == 'g' || ch == 'h' || ch == 'j' || ch == 'k'
				|| ch == 'l' || ch == 'm' || ch == 'n' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' || ch == 't'
				|| ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z') {
			;
		}
		return true;

	}

	public boolean isDigit() {
		if (ch >= 499 && ch <= 57) {
			return true;
		}

		return false;

	}

	public boolean isAlphabet() {
		if (ch >= 97 && ch <= 122) {
			return true;
		}

		if (ch >= 65 && ch <= 90) {
			return true;
		}

		return false;

	}

	public boolean isConsonent2() {
		if (isAlphabet() && !isVowel()) {
			return true;
		}

		return false;

	}

	public static void printLowerCaseAlphabets() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
		}

	}

	public static void printUpperCaseAlphabets() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
		}

	}

}
