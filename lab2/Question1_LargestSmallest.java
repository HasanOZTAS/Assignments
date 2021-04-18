package lab2;

import java.util.Scanner;

public class Question1_LargestSmallest {

	public static void main(String[] args) {
		
		/*
		  Write a program with a loop that lets the user enter
		  a series of integer numbers. After all the numbers
		  have been entered, the program should display the largest
		  and smallest numbers entered.
		 */
		
		Scanner number = new Scanner(System.in);
		
		System.out.println("Enter your first number:");
		int num = number.nextInt();
		
		int smallest=num;
		int largest=0;	
		
				
		do {
			System.out.println("Enter your next number");
			num=number.nextInt();
			System.out.print("Do you want to enter another number: 0-No, 1-Yes ");
			int x = number.nextInt();			
			if (x==1) {				
				if (num>smallest) {
					largest=num;
				}else {
					smallest=num;
				}
			}else {
				System.out.println("Smallest Number is:" + smallest);
				System.out.println("Largest Number is:" + largest);
				break;
			}
		}while(true);
		
		
		
				

	}

}
