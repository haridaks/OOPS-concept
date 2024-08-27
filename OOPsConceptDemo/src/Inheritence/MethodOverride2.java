package Inheritence;

public class MethodOverride2 extends MethodOverride1{
	
	public void run () {
		super.run(); //just calling run method from methodoverride1 by adding 'super' keyword
		System.out.println("yOU ARE running");
	}

	public static void main(String[] args) {
		MethodOverride2 mo2 = new MethodOverride2();
		mo2.run(); //runtime -since method name and parameter are same ,
		            //it will decide which to display(parent or child) only at the run time 
		             //priority - child class 
		            // if you want both parent and child class to display then just add super key keyword inside child method
		            // example: super.run(){}
		
		MethodOverride1 mo1 = new MethodOverride1();
		mo1.run();   //we can either user super keyword or create seperate object for method override 1 and call seperately
	}

}
