//use of switch statement 
package lab_java;

import java.util.Scanner;

public class Lab5 {
	public static void main(String[] args) {
		System.out.println("Enter your grade (A-C)");
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		switch(c)
		{
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
			System.out.println("Good ");
			break;
		case 'C':
			System.out.println("Not Bad ,you have great vision in your life .");
			break;
			default:
				System.out.println("Invalid Input .");
				break;
		}
		
	}
}
