package assignmentDay9;

import java.util.Scanner;

/*
 3.Create a Java program that prompts the user to enter a day of the week (1-7) 
 and then displays the corresponding name of the day using a switch statement.
 */
class WeekDay {
	int num;
	Scanner sc = new Scanner(System.in);
	
	public WeekDay() {
		System.out.println("Enter the number from (1-7): ");
		num = sc.nextInt();
		
		switch(num) {
		
		case 1 :
			System.out.println("The day is Sunday");
			break;
			
		case 2 :
			System.out.println("The day is Monday");
			break;
			
		case 3 :
			System.out.println("The day is Tuesday");
			break;
			
		case 4 :
			System.out.println("The day is Wednesday");
			break;
			
		case 5 :
			System.out.println("The day is Thursday");
			break;
			
		case 6 :
			System.out.println("The day is Friday");
			break;
			
		case 7 :
			System.out.println("The day is Saturday");
			break;
		
			default :
				System.out.println("Please enter valid correspondance number of week.");
		}
		
	}
	
}

public class Weeks {

	public static void main(String[] args) {
		WeekDay day = new WeekDay();

	}

}
