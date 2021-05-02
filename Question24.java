package Assignment10;

public class Question24 {

	public static void main(String[] args) {
		
		/*
		 Given a string, print out true if the number of appearances 
		 of "java" anywhere in the string is equal to the number of 
		 appearances of "python" anywhere in the string (case sensitive).

			Sample Output:

     		input: We study java not python
     		output: true

     		input: What's the difference between java, javascript and python?
     		output: false
		 */
		
		equality("We study java not python");
		equality("What's the difference between java, javascript and python");

	}

	public static void equality(String sentence) {
		
			int countJava = 0;
			int countPython=0;
		
		for (int i=0; i<=sentence.length()-4; i++) {
			if (sentence.substring(i, i+4).equals("java")) {
				countJava++;
			}
		}
		
		for (int i=0; i<=sentence.length()-6; i++) {
			if (sentence.substring(i, i+6).equals("python")) {
				countPython++;
			}
		}
		
		if (countJava == countPython) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
	}

}
