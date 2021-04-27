package Assignment8;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		
		/*
		 Create a method called next3 . This method gets 
		 an int argument and prints the next 3 numbers 
		 after that number. Call the method from main 
		 method and pass num to it.

			enter number
			1
			next 3 are:
			2 3 4
			(put a space between numbers)
		 */
		int num = 0;
		next3(num);

	}

	public static void next3(int num) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		System.out.println("Next 3 are :" + (num+1) + " " + (num+2) + " " + (num+3));
		
		
		
		
	}

}
