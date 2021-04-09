package lab1;

public class Question2 {

	public static void main(String[] args) {
		
		// The number 6
		
		love6(4,6);
		love6(4,5);
		love6(1,5);
		love6(12,6);
		love6(1,8);

	}
	
	public static void love6(int num, int num1) {
		
		if (num==6 || num1==6 || num+num1==6 || num-num1==6 ||num1-num==6) {
			System.out.println(true);
		}else {
			System.out.println("False");
		}
			
	}

}
