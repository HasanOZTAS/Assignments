package Assignment8;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		
		/*
		 Create a method called cube. Write all required code 
		 inside this method in order to ask the user for a number 
		 and then prints the cubed value of that number:

			Example:
			input: 5
			output: 125
		 */		
		cube();

	}

	public static void cube() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int number = sc.nextInt();
		
		System.out.println(number*number*number);
		sc.close();
		
	}

}
