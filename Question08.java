package Assignment8;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		
		/*
		 Complete a method fib() that will compute Fibonacci numbers
		In fibonacci series, next number is the sum of previous two 
		numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……...
		The first two numbers of fibonacci series are 0 and 1.
			Given a number num, print n-th Fibonacci Number.

			Input : 2
			Output : 1

			Input : 9
			Output : 21
		 */
		
		int number =0;
		fib(number);	
		

	}

	public static void fib(int number) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		number = sc.nextInt();
		
		
		int num1=0;
		int num2=1;
		int sumOfNums=0;
		
		System.out.println(number + "th Fibonacci  number");
		
		System.out.print(0 + " ");
		
		for (int i=1; i<number; i++) {			
			
			System.out.print(num2 + " ");
			sumOfNums = num1+num2;
			num1=num2;
			num2=sumOfNums;
			
		}
		
		
		
		
		
		
	}

}
