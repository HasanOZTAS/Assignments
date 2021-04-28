package Assignment10;

public class Question18 {

	public static void main(String[] args) {
		
		/*
		 Given two strings, word and a separator sep, return a big string 
		 made of count occurrences of the word, separated by the separator string.

		Sample Output:

     	input: Word
     	input: X
     	input: 3
     	output: WordXWordXWord

     	input: This
     	input: And
     	input: 2
     	output: ThisAndThis

     	input: This
     	input: And
     	input: 1
     	output: This
		 */
		
		String str1 = "Word";
		String str2 = "x";
		int a = 3;
		
		for (int i=0; i<a; i++) {
			System.out.print(str1);
			if (i !=a-1) {			
			for (int j=0; j<1; j++) {
				System.out.print(str2);
			}
			}
		}

	}

}
