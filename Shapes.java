package assignmentDay9;

import java.util.Scanner;

/* 1. Wrie a Java program that takes a number representing a geometric shape 
(1-3 for triangle, square, or circle) and calculates its area using a switch-case 
statement and functions.
*/

class Area {
	Scanner sc = new Scanner(System.in);
	int a, b, num;
	
	public Area() {
		System.out.print("Enter number 1 for Triangle \nEnter number 2 for Square and \nEnter number 3 for Circle: ");
		 num = sc.nextInt();
		
		switch (num) {
		case 1 :
			Triangle();
			break;
			
		case 2 :
			Square();
			break;
			
		case 3 :
			Circle();
			break;
			
			default :
				System.out.println("Please enter numbers between 1 to 3.");
		
		}
	}
	
	public  void Triangle() {
		System.out.print("Enter the base of triangle: ");
		a = sc.nextInt();
		System.out.print("Enter the height of triangle: ");
		b =sc.nextInt();
		
		double num = 0.5*(a*b);
		System.out.println("The area of Triangle is: "+num);
		
	}
	
	public void Square() {
		System.out.print("Enter the length of Square: ");
		a = sc.nextInt();
		
		int num = a*a;
		System.out.println("The area of Square is: "+num);
		
	}
	
	public void Circle() {
		System.out.println("Enter the radius of circle: ");
		double a = sc.nextInt();
		
		double res = Math.PI*a*a;
		System.out.println("The area of Circle is: "+res);
		
	}
}

public class Shapes {
	
	public static void main(String[] args) {
		Area area = new Area();
	}
	

}
