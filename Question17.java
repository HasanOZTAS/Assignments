package Assignment8;

public class Question17 {

	public static void main(String[] args) {
		
		System.out.println(getThunderBlazz(true,false,1,2,3));
		System.out.println(getThunderBlazz(false,false,1,2,3));
		System.out.println(getThunderBlazz(false,false,1,5,3));
		System.out.println(getThunderBlazz(false,false,3,1,2));
		System.out.println(getThunderBlazz(false,false,3,1,1));
		System.out.println(getThunderBlazz(false,true,9,7,3));
		

	}
	
	public static boolean getThunderBlazz(boolean available,boolean gift, 
			int ingredient1 , int ingredient2, int ingredient3) {
		
		return available || gift ||(ingredient1%1==0&&ingredient2%2==0&&ingredient3%3==0)||
				(ingredient1%3==0&&ingredient2%1==0&&ingredient3%2==0);	
		
		
	}

}
