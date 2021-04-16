package lab2;

import java.util.Scanner;

public class Question6_ {

	public static void main(String[] args) {
		
		/*
		  Write a program that will ask the user to enter the amount of a purchase. 
		  The program should then compute the state and county tax sales tax. 
		  Assume the state sales tax is 4 percent and the county sales tax is 
		  2 percent. The program should display the amount of the purchase , 
		  the state sales tax, the county sales tax, the total sales tax, and 
		  the total of the sale (which is the sum of the amount of purchase plus the total sales tax)
		 */
		
		
		Scanner tax=new Scanner(System.in);
		
		System.out.println("Enter the amount:");
		double amountOfPurchase=tax.nextDouble();
		
		
		double stateTax=amountOfPurchase*0.04;
		double countyTax=amountOfPurchase*0.02;
		double totalTax=stateTax+countyTax;
		double totalOfSale=amountOfPurchase+totalTax;
		
		
		System.out.println("The amount of the purchase is: " + amountOfPurchase);
		System.out.println("The state sales tax is: " + stateTax);
		System.out.println("The county sales tax is: " + countyTax);
		System.out.println("Total tax is: " + totalTax);
		System.out.println("Total of the sale is: " + totalOfSale);

		
		
		

	}

}
