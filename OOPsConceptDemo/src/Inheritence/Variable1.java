package Inheritence;

public class Variable1 {
	
	int age = 10; //Global variable
	
	static int roll = 1; //static variable

	public static void main(String[] args) {
		
		int c = 20; // local variable
		
		int a; //declaration of a variable
		int b = 10; //definition of the variable
		
		Variable1 obj = new Variable1(); 
		
		System.out.println(b);
		System.out.println(obj.age); //global variable cannot be called without object inside main method
		                        //so creating object for the class first, then calling it
		System.out.println(roll); //static can be called directly no need for object
		

	}

}
