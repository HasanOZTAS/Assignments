package lab3;

public class Question03 {

	public static void main(String[] args) {
		
		/*
		 Create a method return a new string made of 3 copies of the last 2
		 chars of the original string. The string length will be at least 2.
		 extraEnd("Hello") - "lololo" extraEnd("ab") -"ababab" extraEnd("Hi") -
		 "HiHiHi"
		 */

		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("Learning Java"));
		System.out.println(extraEnd("Hi"));
		System.out.println(extraEnd("a"));

	}

	public static String extraEnd(String str) {
		
		if (str.length()<2) {
			return "Invalid String";			
		}
			String abc = str.substring(str.length()-2) ;		
			return abc + abc + abc;
	}
}