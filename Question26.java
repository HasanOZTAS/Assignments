package Assignment10;

public class Question26 {

	public static void main(String[] args) {
		
		/*
		 uniqueChars is a method that you will code now, 
		 should be able to accept any string in the word 
		 and return unique characters from the parameter.

			Sample Output:

     		uniqueChars("java") ==> "jav"

     		uniqueChars("mama") ==> "ma"

     		uniqueChars("spoon") ==> "spon"
		 */
		
		uniqueChars("java");	
		uniqueChars("mama");
		uniqueChars("spoon");
		
		System.out.println(uniqueChars("java"));
		System.out.println(uniqueChars("mama"));
		System.out.println(uniqueChars("spoon"));
		
		
		

	}
	
	public static String uniqueChars(String str) {
		String newstr="";
		
		for (int i = 0; i < str.length(); i++) {
			String otherChars=""+str.charAt(i);
			if (!newstr.contains(otherChars) ) {
				newstr+=otherChars;				
			}			
		}		
		return newstr;
	}

}
