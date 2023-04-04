package arithmeticPractice2;

public class SwaptwoNumbers {
	
	public void swappingwithThirdvar() {
		int x=10;
		int y=5;
		int temp = x;
		x=y;
		y=temp;
		
		System.out.println("The x value is " + x);
		
		System.out.println("The y value is " + y);
	}

	public void swappingwithoutThirdvar() {
		int x=10;
		int y=5;
		
		x=x-y;
		y=x+y;
		x=y-x;
		
		System.out.println("The x value is " + x);
		
		System.out.println("The y value is " + y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwaptwoNumbers obj = new SwaptwoNumbers();
		obj.swappingwithThirdvar();
		obj.swappingwithoutThirdvar();
	}

}
