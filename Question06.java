package lab3;

public class Question06 {

	public static void main(String[] args) {
		
		/*
		 Given a string, return a version without the first and last char,
		 so "Hello" yields "ell". The string length will be at least 2.
		 withoutEnd("Hello") - "ell" withoutEnd("java") - "av" withoutEnd("coding") -
		 "odin"
		 */
		
		
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
		System.out.println(withoutEnd("H"));
		

	}
	
	public static String withoutEnd(String word) {
		
		if(word.length()<2) {
			return "Invalid word";
		}
		return word.substring(1,word.length()-1);
		
	}
}
