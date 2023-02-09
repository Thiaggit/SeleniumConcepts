package polymorphism;

public class OverridingClassTwo extends OverridingClassOne{
	
	public void method2() {
		System.out.println("This is method 2 from child class"); //method2 is overridden here
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverridingClassOne obj = new OverridingClassTwo();
		obj.method1();
		obj.method2();
		
	}

}
