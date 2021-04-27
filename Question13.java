package Assignment8;

public class Question13 {

	public static void main(String[] args) {
		
		/*
		This method calculates a water bill, the method gets a double and returns a double.

		The more water you use the more it will cost you (as a fine for wasting water).

		for example:

		waterTax(50)
		returns 30

		waterTax(55)
		returns 49.5

		waterTax(101)
		returns 140.9

		waterTax(151)
		returns 235.9

		the regular calculation under 50 is
		bill = units * 0.60;
		above 50 is:
		bill = units * 0.90;

		above 100 the calculation is like above 50 but with a 50 as fine

		and above 150 it is the same as above 50 (units *0.90) but with a 100 fine added to the price.
		*/
		
		double result=waterTax(50);
		System.out.println(result);			

	}
	public static double waterTax(double unit) {
		if (unit<=50) {
			return unit*0.60;
		}
		if (unit>50&&unit<=100) {
			return unit*0.90;
		}else
			if (unit>100&&unit<=150) {
				return unit*0.90+50;
			}else
		return unit*0.90+100 ;
	}

}
