package Assignment8;

public class Question07 {

	public static void main(String[] args) {
		
		/*
		 Complete a method isPalindrome() that will check 
		 if the number is a palindrome. Print your result 
		 as a boolean (true or false).
			Do not convert int into a string!
			Example:
			input: 1001
			output: true

			Example:
			input: 123
			output: false
		 */	
		
		int num=3553;
		
		System.out.println(isPalindrome(num));

	}

	public static boolean isPalindrome(int num) {
		
		boolean flag = false;

		int reverse = 0;
		int numLast = num;

		while (num > 0) {
			reverse = (reverse * 10) + num % 10;
			num /= 10;
	
		}

		if (reverse == numLast) {
			flag = true;
		}

		return flag;
		
		
		
	}

}
