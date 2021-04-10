package assignments.Assignment3;

public class Question4_SwapValues {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("n1=" + num1);
		System.out.println("n2=" + num2);

	}

}
