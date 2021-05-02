package Assignment10;

public class Question30 {

	public static void main(String[] args) {
		
		/*
		 at3 method gets two strings and returns a string. 
		 The first string is the one that will be manipulated. 
		 At the 3rd char position of the target you will insert the word argument.

			Sample output:

     		at3("longword","foo")
     		return: "lonfoogword"

     		at3("blabla","a")
     		return: "blaabla"
		 */
		
		String newat3 = at3("longword","foo");
		System.out.println(newat3);
		

	}

	public static String at3(String word, String str) {
		
		return word.substring(0, 3).concat(str).concat(word.substring(3, word.length()));
			
		}	

}
