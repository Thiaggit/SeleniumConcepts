package statickeyword;

public class StaticMethod {

	public static void Method1() {
		
		System.out.println("Static method");
	}
	
	public void Method2() {
		//A non static method can call static method
		Method1();
		System.out.println("Non-Static method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method1(); //No need to create object to call static method
		StaticMethod obj = new StaticMethod();
		obj.Method2(); // Object is needed to call static method
		
	}

}
