package Assignment10;

public class Question29 {

	public static void main(String[] args) {
		
		/*
		 This method gets a string and an int, 
		 it returns a string. What it does is to 
		 limit the inputted string to a creating 
		 number of characters.

			Sample Output:

     		limit("abcd",2)
     		returns "ab"

     		limit("bla bla",3)
     		returns "bla"
		 */
		
		String newlimit = limit("bla bla",3);
		System.out.println(newlimit);
		

	}

	public static String limit(String str, int a) {
		
		String newStr="";
		
		for (int i=0; i<a; i++) {
			newStr += str.charAt(i);
		}
		return newStr;
	}

}
