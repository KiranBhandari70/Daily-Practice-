package assignmentDay9;

/*
 2.Develop a Java program that takes a single digit (0-9) as input and prints
 its corresponding word representation (zero, one, two, etc.) using a switch-case statement.
 */

import java.util.Scanner;

class Numbers {
	int num;
	Scanner sc = new Scanner(System.in);
	
	public Numbers() {
		System.out.println("Enter any numbers from (0-9): ");
		num = sc.nextInt();
		
		switch (num) {
		
		case 0 :
			System.out.println("Zero");
			break;
			
		case 1 :
			System.out.println("One");
			break;
			
		case 2 :
			System.out.println("Two");
			break;
			
		case 3 :
			System.out.println("Three");
			break;
			
		case 4 :
			System.out.println("Four");
			break;
			
		case 5 :
			System.out.println("Five");
			break;
			
		case 6 :
			System.out.println("Six");
			break;
			
		case 7 :
			System.out.println("Seven");
			break;
			
		case 8 :
			System.out.println("Eight");
			break;
			
		case 9 :
			System.out.println("Nine");
			break;		
			
			default :
			System.out.println("Pleade enter numbers between 0 to 9");
		}
	}
}

public class NumbersValue {

	public static void main(String[] args) {
		Numbers num = new Numbers();
		
	}

}
