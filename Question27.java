package Assignment10;

public class Question27 {

	public static void main(String[] args) {
		
		/*
		 coverString method will take 2 string parameters from the caller.

		 Your job is to write an important code that will :

			- to search and find each appearance of coverME within main
			- then surround it with [coverMe] (square brackets)
			- if you cannot find the coverME within main after tirelessly 
			looping then just return whole main itself covered [main].
			- keep in mind that coverME value can be of any length.

			Sample Output:

     		coverString("java methods", "me") ) ; ==> "java [me]thods"

     		coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"

     		coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"

     		coverString("apples", "pears") ) ; ==> "[apples]"
		 */
		
		String words = coverString("java methods", "me");
		System.out.println(words);	

	}

	public static String coverString(String str1, String str2) {
		
		if (!str1.contains(str2)) {
			return "["+ str1+"]";
			
		}else {
			
			String dummy="";
			String a="["+str2+"]";
			for (int i = 0; i < str1.length(); i++) {
				
					dummy=dummy+str1.charAt(i);
							
				if (i==str1.indexOf(str2)-1) {
					dummy=dummy+a;
					i=i+str2.length()-1;
					str1=str1.replaceFirst(str2, " ");
				}				
			}						
			return dummy;
		}		
	}	
}
