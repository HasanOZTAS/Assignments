package Assignment8;

public class Question14 {

	public static void main(String[] args) {
		
		/*
		 This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

		It returns true only if both a and b are true or c is true.

		https://en.wikipedia.org/wiki/Truth_table
		 */
		
		boolean result=	threelocks(false,true,true);
		System.out.println(result);
		

	}
	
	public static boolean threelocks(boolean a, boolean b, boolean c) {
		
		return (a && b) || c;
		
	}

}
