package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

	public static void main(String[] args) {

		MyChar myChar = new MyChar('c');
		System.out.println(myChar.isVowel());

		System.out.println(myChar.isDigit());
		System.out.println(myChar.isAlphabet());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();

		// TODO Auto-generated method stub

	}

}
