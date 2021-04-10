package assignments.Assignment3;

public class Question6_CaffeineOverdose {

	public static void main(String[] args) {
		
		// 1 gram is == 1000 milligrams
		// 10 gram is == 10000 milligrams
		
		final int overdose=10000;
		int numOfMiligramPerDrink=500;
		
		int drinks=overdose/numOfMiligramPerDrink;
		
		
		System.out.println("It would take about " + drinks + " drinks for a lethal overdose");
		

	}

}
