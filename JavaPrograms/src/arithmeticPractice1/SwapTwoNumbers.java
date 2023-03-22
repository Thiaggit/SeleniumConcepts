package arithmeticPractice1;

public class SwapTwoNumbers {
	
	public void SwapingNumbers() {
		int x=5;
		int y = 10;
		int temp = y;
		y=x;
		x= temp;
		
		System.out.println("The x value is " + x);
		System.out.println("The y value is " + y);
	}
	
	public void SwapingWithoutThirdVariable() {
		int x=5;
		int y = 10;
		x=x-y;
		y=x+y;
		x=y-x;
		
		System.out.println("The x value is " + x);
		System.out.println("The y value is " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoNumbers obj = new SwapTwoNumbers();
		//obj.SwapingNumbers();
		obj.SwapingWithoutThirdVariable();
	}

}
