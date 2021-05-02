package Assignment10;

public class Question23 {

	public static void main(String[] args) {
		
		/*
		 A sandwich is two pieces of bread with something in between. 
		 Print the string that is between the first and last appearance 
		 of "bread" in the given string, or return string "nothing" if 
		 there are not two pieces of bread.

			Sample Output:

     		input: breadjambread
     		output: jam

     		input: xxbreadjambreadyy
     		output: jam

     		input: xxbreadapple
     		output: nothing

     		input: breadbutterbread
     		output: butter
		 */
		
		sandwich("breadjambread");	
		sandwich("xxbreadjambreadyy");
		sandwich("xxbreadapple");
		sandwich("breadbutterbread");
		

	}

	public static void sandwich(String word) {
		
		String output = "";
		
		if (word.replaceFirst("bread", "").contains("bread")) {
			
			output = word.substring(word.indexOf("bread")+5, word.indexOf("bread", 5));
		System.out.println(output);
		}else {
			System.out.println("nothing");
		}
		
		
		
		
		
	}

}
