package Assignment10;

public class Question16 {

	public static void main(String[] args) {
		
		/*
		 Given a string word, print true if "java" appears 
		 starting at index 0 or 1 in the string, such as with 
		 "javaxxx" or "xjavaxx" but not "xxjavaxx". The string 
		 should be 4 and more characters.

		Sample Output:
     	input: javapython
     	output: true

     	input: cjavac++
     	output: true

     	input: c#javaruby
     	output: false
		 */
		
		String str = "xjavapython";
		
		boolean flag = false;
		
		if (str.length()<4) {
			System.out.println("Invalid word");
		}else if (str.substring(0, 4).equals("java") || str.subSequence(1, 5).equals("java")) {
			flag = true;
		}else {
			flag = false;
		}
		System.out.println(flag);
		
		

	}

}
