package net.codejava;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your Name?");
		
		
		String firstname = input.nextLine();
		
		System.out.printf ("Hello %s\n", firstname);
		System.out.printf ("Goodbye %s\n", firstname);
		
		//System.out.println("Hello ".concat(firstname));
		
		// TODO Auto-generated method stub
		
		//System.out.println("Hello World");
		System.out.println("Today is awesome!");

	}

}
