package lab1;

public class Question5 {
	
	public static void main(String[] args) {
		
		caughtSpeeding(60,false);
		caughtSpeeding(65,false);
		caughtSpeeding(65,true);
		caughtSpeeding(85,true);
		caughtSpeeding(85,false);
		
		
		
	}

	public static void caughtSpeeding(int speed, boolean birthday) {
		
		
		
		if(birthday) {
			
			if(speed<=65) {
				System.out.println(0);
			}else if (speed>65 && speed<=85) {
				System.out.println(1);
			}else {
				System.out.println("2");
			}
		}else {
			if(speed<=60) {
				System.out.println(0);
			}else if (speed>60 && speed<=80) {
				System.out.println(1);
			}else {
				System.out.println("2");
			}
		}
		
		
		
		
	}

}
