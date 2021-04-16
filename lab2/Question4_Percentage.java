package lab2;

import java.util.Scanner;

public class Question4_Percentage {

	public static void main(String[] args) {		
		
		/*
		 Write a program that asks user for the number of males and 
		 the number of females registered in a class. The program 
		 should display the percentage of males and females in the class
		 */
		
		Scanner total = new Scanner(System.in);
		
		System.out.println("Enter the number of the Males: ");
		int males = total.nextInt();
		
		System.out.println("Enter the number of the Females: ");
		int females = total.nextInt();
		
		double malesPercentage=(males*100)/(males+females);
		double femalesPercentage=(females*100)/(males+females);
		
		
		
		
		System.out.println("Percentage of Males is: %" + malesPercentage);
		System.out.println("Percentage of Females is: %" + femalesPercentage);
		
		
		
		
		

	}

}
