package Assignment10;

public class Question19 {

	public static void main(String[] args) {
		
		/*
		 Return the number of times that the string "java" 
		 appears anywhere in the given string word.

			Sample Output:

     		input: javaxjava
     		output: 2

     		input: javaxjavaapplepearjavaegg
     		output: 3
		 */
		
		String word = "javaxjavaapplepearjavaeggjavaaajavabkl";
		
		int counter = 0;
		
		for (int i=0; i<word.length()-4; i++) {
			if (word.substring(i, i+4).equals("java")) {
				counter++;
			}
		}
		System.out.println(counter);
		
		
		
		

	}

}
