package Assignment10;

public class Question25 {

	public static void main(String[] args) {
		
		/*
		 When gears merge and work together, one tooth from each one goes in order.
		 Write a method mergeStrings that will return the strings merged, one letter 
		 at a time, starting with one. Please note one and two can be of different 
		 lengths. Please look at below examples:

     		s1 ==> "12345"
     		s2 ==> "abcde"
     		mergeStrings(s1,s2) ==> "1a2b3c4d5e"

     		mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

     		mergeStrings("java", "selenium") ==> "jsaevlaenium"
		 */
		
		mergeStrings("12345", "abcde");
		mergeStrings("wooden", "spoon");
		//mergeStrings("java", "selenium");
		
		

	}

	public static void mergeStrings(String str1, String str2) {
		
		for (int i=0; i<str1.length(); i++) {
			System.out.print(str1.substring(i, i+1));
			
			if (str1.length() == str2.length()) {			
			
				for (int j=i; j<=i; j++) {
					System.out.print(str2.substring(j,j+1));
				}	
			}
			else if (str1.length() > str2.length()) {
				for (int j=i; j<=i; j++) {
					System.out.print(str2.substring(j, j+1));
					if (j==str2.length()-1) {
						break;
					}
				}
				
			}
		}
		System.out.println();
		
		
	}

}
