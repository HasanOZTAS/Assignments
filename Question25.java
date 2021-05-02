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
		mergeStrings("java", "selenium");
		
		

	}

	public static void mergeStrings(String str1, String str2) {
		
		int str1len=str1.length();
		int str2len=str2.length();
		String word="";
				if (str1len==str2len) {
					for (int i = 0; i < str2len; i++) {
						word += ""+str1.charAt(i)+str2.charAt(i);
						
					}
				}else if (str1len>str2len) {
					for (int i = 0; i < str2len; i++) {
						word += ""+str1.charAt(i)+str2.charAt(i);
						
					}
					word += str1.substring(str2len);
				}else {
					for (int i = 0; i < str1len; i++) {
						word += ""+str1.charAt(i)+str2.charAt(i);
						
					}
					word += str2.substring(str1len);
				}
			
				System.out.println(word);
			}
			
			
}



