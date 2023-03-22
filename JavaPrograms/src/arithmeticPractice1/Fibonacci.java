package arithmeticPractice1;

public class Fibonacci {
	
	public void findingFibonacci() {
		int num1 = 0;
		int num2 = 1;
		int num3;
		int n=10;
		for(int i=1;i<=n;i++) {
			System.out.print(num1 + " ");
			num3=num1+num2;
			num1=num2;
			num2=num3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci obj = new Fibonacci();
		obj.findingFibonacci();
	}

}
