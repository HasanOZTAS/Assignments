package Assignment8;

public class Question10 {

	public static void main(String[] args) {
		
		/*
		 isEven method gets a number(int) if its even (2,4,8...) returns true.
		  if its odd return false.

			for example:
			isEven(1) --> false
			isEven(8) --> true
		 */
		
		int num=50;
		boolean result =isEven(num);
		System.out.println(result);

	}

	public static boolean isEven(int num) {
		
		return num%2==0 ? true : false;
		
		
		
	}

}
