package assignmentDay9;

import java.util.Scanner;

/*
 4.Write a Java program that uses a switch statement to print the name of a month based 
 on a given integer input representing the month number.
 */

class MonthYear {
	int num ;
	Scanner sc = new Scanner(System.in);
	
	public MonthYear() {
		System.out.println("Enter the number correspondance to month: ");
		num = sc.nextInt();
		
switch(num) {
		
		case 1 :
			System.out.println("The month is January");
			break;
			
		case 2 :
			System.out.println("The month is Feburary");
			break;
			
		case 3 :
			System.out.println("The month is March");
			break;
			
		case 4 :
			System.out.println("The month is Aprii");
			break;
			
		case 5 :
			System.out.println("The month is May");
			break;
			
		case 6 :
			System.out.println("The month is June");
			break;
			
		case 7 :
			System.out.println("The month is July");
			break;
			
		case 8 :
			System.out.println("The month is August");
			break;
			
		case 9 :
			System.out.println("The month is September");
			break;
			
		case 10 :
			System.out.println("The month is October");
			break;
			
		case 11 :
			System.out.println("The month is November");
			break;
			
		case 12 :
			System.out.println("The month is December");
			break;
		
			default :
				System.out.println("Please enter valid correspondance number of month.");
		}
	}
}

public class Months {
	public static void main(String[] args) {
		MonthYear mn = new MonthYear();
	}

}
