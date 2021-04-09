package lab1;

public class Question6 {

	public static void main(String[] args) {
		
		cigarParty(30,false);
		cigarParty(50,false);
		cigarParty(70,true);
		cigarParty(25,false);

	}

	public static void cigarParty(int i, boolean weekend) {
		
		if(weekend) {
			if(i>=40) {
				System.out.println("True");
			}else {
				System.out.println(false);
			}				
		}else {
			if(i>=40 && i<=60) {
				System.out.println(true);
			}else {
				System.out.println("False");
			}
		}
	}

}
