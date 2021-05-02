package Assignment10;

public class Question28 {

	public static void main(String[] args) {
		
		/*
		This method gets two strings (text and badWord) 
		and returns a string. Basically what it does is 
		take out all the occurrences of badWord in text.

		Sample Output:

		     clean ("one two three","two")
		     returns "one three"

		     clean ("foo bar","foo")
		     returns "bar"

		     clean ("he said bla bla bla","bla")
		     returns "he said "
		*/
		
		String newtext = clean ("one two three","two");
				
		System.out.println(newtext);
		
		
		
		
	}

	public static String clean(String text, String str) {
		
		return text.replace(str, "");
		
		
		
	}

}
