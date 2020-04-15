
import java.util.Scanner;



public class MadLib {
	

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a Name");
		String name = userInput.nextLine();
		System.out.println("Give me an adjective");
		String adjective = userInput.nextLine();
		System.out.println("Give me a Verb");
		String verbOne = userInput.nextLine();
		System.out.println("Give me another Verb");
		String verbTwo = userInput.nextLine();
		System.out.println("Give me a Number");
		String number = userInput.nextLine();
		System.out.println("Give me your name: ");
		String yourName = userInput.nextLine();
		
		
		System.out.printf("Here is your story: \n");
		System.out.printf("\n Dear %s,", name);
		System.out.printf("\n Your are extremely %s and I want to %s you!", adjective, verbOne);
		System.out.printf("\n I want to %s you %s times.", verbTwo, number);
		
	}
	
}


