package assignments.Assignment3;

public class Question5_hoursMinutesSeconds {

	public static void main(String[] args) {
		
		int inputSeconds=3695;
		int seconds=inputSeconds%60;
		int minutes=((inputSeconds/60)%60);	
		int hours=(inputSeconds/60)/60;
		
		System.out.println(inputSeconds + " minutes is " + hours + " hours," + minutes + " minutes, " + seconds + " seconds");
		
		

	}

}
