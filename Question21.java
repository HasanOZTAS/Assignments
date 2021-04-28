package Assignment10;

public class Question21 {

	public static void main(String[] args) {
		
		/*
		 Given a string, consider the prefix string made of the 
		 first n chars of the string. Does that prefix string 
		 appear somewhere else in the string?
		Assume that the string is not empty and that n is in the range from 1 till str.length().

			Sample Output:

     			input: abXYabc
     			input: 1
     			output: true
     			a appears twice

     			input: abXYabc
     			input: 2
     			output: true
     			ab appears twice

     			input: abXYabc
     			input: 3
     			output: false
     			abX appears once only
		 */
		
		String word = "abXYabca";
		int input = 2;
		boolean output = false;
		int counter = 0;
		
		
		
		for (int i=0; i<=word.length()-input; i++) {
			if (word.substring(0, input).equals(word.substring(i, i+input))) {
				output = true;
				counter++;
				
			}
			
		}System.out.println(output + "... " + word.substring(0, input) + " appears " + counter + " times");
		
		

	}

}
