package Inheritence;

//Single inheritance

public class SingleInheritance2 extends SingleInheritance1{
	
	public void multiply(int x , int y) {
		a= x*y;
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		SingleInheritance2 obj = new SingleInheritance2();
		obj.add(10, 20);
		obj.multiply(10, 10);
		

	}

}
