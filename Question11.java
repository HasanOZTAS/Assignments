package Assignment8;

public class Question11 {

	public static void main(String[] args) {
		
		/*
		 c_profits gets the buyPrice(int) and sellPrice(int) and 
		 determines if there was a profit or loss.
		 it returns a string value that can be "profit","loss","no loss"

			for example:
			c_profits(100,1500)
			returns : "profit"

			c_profits(20,5)
			returns : "loss"

			c_profits(100,100)
			returns : "no loss"
		 */
		
		int buyPrice=20;
		int sellPrice=50;
		
		String result = c_profits(buyPrice, sellPrice);
		System.out.println(result);


		

	}

	public static String c_profits(int buyPrice, int sellPrice) {
		
		return buyPrice==sellPrice ? "No loss" : buyPrice<sellPrice ? "Profit" : "Loss";
		
		
	}

}
