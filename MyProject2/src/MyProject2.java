
import java.util.Scanner;

public class MyProject2 {
	

	public static void main(String[] args) {
		int number;
		
		Scanner scanner = new Scanner(System.in); 
		
	    System.out.println("Please enter a number");
	    
	    number = scanner.nextInt();
	    System.out.printf("%d * %d = %d", number, number, number*number).println();
	    
	    int Total = Sum(number);
	    
	    System.out.println("Total is" + Total);
	    
	    Cubelogic cube =new Cubelogic();
	   int i = cube.calculatecube(number);
	   System.out.println(i);

	}
	
	static int Sum(int number) {
		
		return number*number + 10;
	}

}
