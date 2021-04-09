package lab1;

public class Question1 {

	public static void main(String[] args) {
		
		//  Many times Hi
		
		stringTimes("Hi", 14);	
	   // stringTimes2("Hi", 5);

	}

	
	// 2nd way
	public static void stringTimes2(String string, int i) {  
		String str="";
		for (int a=0; a<i; a++) {
			str=str+string;
		}
		System.out.println(str);
		
	}

	public static void stringTimes(String hi, int i) {
		
		for (int a=1; a<=i; a++) {
			System.out.print(hi+ " ");
			
		}
		
		
		
	}

}
