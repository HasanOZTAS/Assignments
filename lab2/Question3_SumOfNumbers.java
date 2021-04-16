package lab2;

import java.util.Scanner;

public class Question3_SumOfNumbers {

	public static void main(String[] args) {
		
		/*
		Write a program that asks the user for a positive nonzero integer value. 
		The program should use a loop to get the sum of all the integers 
		from 1 up to the number entered. 
		*/
		
		
		int sum=0;
		int x=0;
		
		Scanner positive = new Scanner(System.in);
					
		do {
			System.out.println("Enter a positive number");
			x=positive.nextInt();
			if (x<0) {
				break;
			}else {
				sum=sum+x;
				System.out.println("Total is: " + sum);
			}		
		}while (true);
		
	}
}
