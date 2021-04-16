package lab2;

import java.util.Scanner;

public class Question2_CookieCalory {

	public static void main(String[] args) {
		
		/*
		 A bag of cookies holds 40 cookies. The calorie information on the bag claims that
		  there are 10 serving in the bag and that a serving equals 300 calories. 
		  write a program that lets the user enter the number of cookies he or she
		  actually ate and then reports the number of total calories consumed.
		 */
		
		Scanner cookies = new Scanner(System.in);
		
		
		// cookies 40, 1 serving 40/10=4 cookies, 1 cookie calory is 300/4=75
		int oneCookieCalory  = 75;
		
		System.out.println("Enter the number of cookies you ate: ");
		int eatenCookies = cookies.nextInt();
		
		int totalCalory=oneCookieCalory*eatenCookies;
		
		System.out.println("Total calories that you consumed is: " + totalCalory);
		
		
		
		

	}

}
