package Assignment10;

public class Question20 {

	public static void main(String[] args) {
		
		/*
		 In mathematics, the factorial of a positive integer n, 
		 denoted by n!,  is the product of all positive integers 
		 less than or equal to n. Calculate factorial and output 
		 result to the console.

			Sample Output:

     		input: 5
     		output: 120
		 */
		
		int input = 5;
		int output= 1;
		
		if (input<1) {
			System.out.println("Invalid number");			
		}else {
			for (int i=input; i>=1; i--) {
				output*=i;
			}
			System.out.println(output);	
		}

	}

}
