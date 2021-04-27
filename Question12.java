package Assignment8;

public class Question12 {

	public static void main(String[] args) {
		
		/*
		 The danish prince most famous quote is "to be or not to be". that's a classic example of boolean logic.

		 the hamletQuote method only returns true if one of or both of the boolean parameters is true.

			example:

			hamletQuote(true, false)
			returns true

			amletQuote(false,true)
			returns true

			hamletQuote(true,true)
			returns true

			hamletQuote(false,false)
			returns false
		 */
		
		System.out.println(hamletQuote(true,false));
		

	}
	 public static boolean hamletQuote(boolean b1,boolean b2) {
	        return b1 || b2;
	 }
}
	 
