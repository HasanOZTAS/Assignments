package lab3;

public class Question01 {

	public static void main(String[] args) {
		
		/*
		 Create a method that accepts 1 string, e.g. "Bob", return a
		 greeting of the form "Hello Bob!". helloName("Bob") - "Hello Bob!"
		 helloName("Alice") - "Hello Alice!" helloName("X") - "Hello X!"
		 */
		
		
		//helloName("Hasan");
		System.out.println(helloName("Hasan"));
		System.out.println(helloName("Bob"));
		System.out.println(helloName("Alice"));
		
	}

	public static String helloName(String name) {
		return "Hello ".concat(name).concat("!");
		//return "Hello " + name + "!";
	}

}
