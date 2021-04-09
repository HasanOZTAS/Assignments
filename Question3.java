package lab1;

public class Question3 {

	public static void main(String[] args) {
		
		specialEleven(22);
		specialEleven(23);
		specialEleven(24);
		specialEleven(50);
		specialEleven(25);

	}
	public static void specialEleven(int Eleven) {
		
			
		if (Eleven%11==0 || Eleven%11==1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
	}

}
