package Inheritence;

//Method overloading polymorphism
//This can also be achieved through inheritance - simply write main method in methodoverload2 class and create object for that and call methods there
public class MethodOverload1 {

	public static void main(String[] args) {
		
		MethodOverload1 mo1 = new MethodOverload1(); //creating object for the class inside main method
		mo1.add(10, 20); //simply calling the methods using object reference
		mo1.add(1, 1, 1);

	}

	public void add(int a, int b) {  //method name same and different parameters
		System.out.println(a + b);
	}
	
	public void add(int a , int b , int c) {   //method name same(add) and different parameters
		System.out.println(a+b+c);
	}
}
