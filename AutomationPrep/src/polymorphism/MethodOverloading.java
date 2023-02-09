package polymorphism;

public class MethodOverloading {
	
	public int method(int a, int b) {		
		return a+b;
	}
	
	public int method(int c, int d, int e) {		
		return c+d+e;
	}
	
	public double method(double a, double b) {
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading obj = new MethodOverloading();
		System.out.println("The addition is "+ obj.method(500, 10));
		System.out.println("The addition is "+ obj.method(500, 10, 45));
	}

}
