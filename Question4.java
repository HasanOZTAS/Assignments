package lab1;

public class Question4 {

	public static void main(String[] args) {
		
		deerPlay(70,false);
		deerPlay(95,false);
		deerPlay(95,true);
		deerPlay(50,true);
		

	}

	public static void deerPlay(int temp, boolean isSummer) {
		
		if(isSummer) {
			if( temp>=60 && temp<=100) {
				System.out.println(true);
			}else {
				System.out.println("False");
			}
		}else {
			if(temp>=60 && temp<=90) {	
				System.out.println("True");
			}else {
				System.out.println(false);
			}
		}
	}
}
