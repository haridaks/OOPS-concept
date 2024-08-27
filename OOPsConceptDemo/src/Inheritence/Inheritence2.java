package Inheritence;

public class Inheritence2 extends Inheritence1 {
	
	String name = "Java programming";

	public static void main(String[] args) {
		
		Inheritence2 obj = new Inheritence2();
		
		System.out.println(obj.name); 
		System.out.println(obj.roll); //inheriting from parent(inheritence 1 using extends keyword)
		
		

	}

}
