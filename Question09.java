package Assignment8;

public class Question09 {

	public static void main(String[] args) {
		
		/*
		 Create a method called max. It gets two ints, x and max.
			x is the test case, max is what we test against.

			if x is bigger then max return max
			in any other case return x.

			for example:

			max(1,10)
			returns 1

			max(11,5)
			returns 5
		 */
		
		int max=5;
		int x=10;
		int result =max(x, max);
		System.out.println(result);
		

	}

	public static int max(int x, int max) {
				
		if (x > max) {
			return max;
		}else {
			return x;
		}
		
		
	}

}
