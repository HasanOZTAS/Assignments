package lab3;

public class Question07 {

	public static void main(String[] args) {
		
		/*
		 Given 2 strings, a and b, return a string of the form
		 short+long+short, with the shorter string on the outside and the longer
		 string on the inside. comboString("Hello", "hi") -"hiHellohi"
		 comboString("hi", "Hello") - "hiHellohi" comboString("aaa", "b") - "baaab"
		 */
		
		System.out.println(comboString("Hello", "Hi"));
		System.out.println(comboString("Hi", "Hello"));
		System.out.println(comboString("aaa", "b"));
		
		

	}

	public static String comboString(String str1, String str2) {
		
		String str;
		if (str1.length() > str2.length()) {
			str = str2.concat(str1).concat(str2);
		}else {
			str = str1.concat(str2).concat(str1);
		}
		return str;
		
	}

}
