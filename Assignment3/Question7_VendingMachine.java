package assignments.Assignment3;

public class Question7_VendingMachine {

	public static void main(String[] args) {
		
		// 1 dollar == 100 cents
		
		int price=95;
				
		int change=100-price;
		
		int quarters=change/25;		
		int dimes=(change%25)/10;
		int nickles=((change%25)%10)/5;
		
			
		System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, " + nickles + " nickles");

		
	}

}
