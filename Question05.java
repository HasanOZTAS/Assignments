package Assignment8;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		
		/*
		 Create a method called sign.  It gets a number 
		 and tells you if it's positive, negative or zero.

		for example :
			sign(5) => 1
			sign(-30)=> -1
			sign(0) => 0

			sign gets an int parameter.
			print out 1,-1 or 0 depending on the input
			the parameter should be entered by user (create a scanner object)
		 */
		
		int number=0;
		//sign(number);
		System.out.println(sign(number));

	}

	public static int sign(int number) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		 number = sc.nextInt();
		
		if (number == 0) {
			return 0;
		}else if (number < 0) {
			return -1;
		}else {
			return 1;
		}
		
		
		
	}

}
