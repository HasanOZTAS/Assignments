package lab2;

import java.util.Scanner;

public class Question5_TotalBill {

	public static void main(String[] args) {
		
		/*
		 Write a program that computes the tax and tip on a restaurant bill. 
		 The program should ask the user to enter the charge for the meal. 
		 The tax should be 6.75 percent of the meal charge. The tip should be 
		 20 percent of the total after adding tax. Display the meal charge, 
		 tax amount, tip amount, and total bill on the screen.
		 */
		
		Scanner bill = new Scanner(System.in);
		
		System.out.println("Please enter the charge for the meal: ");
		double mealCharge=bill.nextDouble();
		
		double tax=mealCharge*0.0675;
		double tip=(mealCharge+tax)*0.2;
		double totalBill=mealCharge+tax+tip;
		
		
		
		System.out.println("Meal Charge is: " + mealCharge);
		System.out.println("Tax amount: " + tax);
		System.out.println("Tip amount: " + tip);
		System.out.println("Total Bill is :" + totalBill);
		
		
		
		
		
		
		

	}

}
