package Assignment10;

public class Question31 {

	public static void main(String[] args) {
		
		/*
		Palindrome is a word, phrase, or sequence that reads 
		the same backward as forward, e.g., madam or nurses run.

		So method isPalindrome checks that and returns true if 
		check is palindrome and false if it is not.

		- make your conditions case insensitive. ex: Civic and 
		civic are both palindromes
		- make your conditions space insensitive. Race car is a 
		palindrome even though there is space in between.

		Sample Output:

		     isPalindrome("Noon") ==> true

		     isPalindrome("I am not palindrome") ==> false

		     isPalindrome("wooden") ==> false

		     isPalindrome("Nurses Run") ==> true
		 */
		
		boolean newText = isPalindrome("Nurses Run");
		System.out.println(newText);
		

	}

	public static boolean isPalindrome(String text) {
		
		String newText="";
		boolean flag = false;
		text = text.replace(" ", "");
		for (int i=text.length()-1; i>=0; i--) {
			newText += text.charAt(i);
		}
		if (text.equalsIgnoreCase(newText)) {
			flag = true;
		}else {
			flag = false;
		}
			return flag;
		
	}

}
