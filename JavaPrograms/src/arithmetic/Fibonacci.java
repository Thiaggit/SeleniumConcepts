package arithmetic;

public class Fibonacci {

	public void FindFibonacci() {
		int first = 0;
		int second = 1;
		int third;
		int n=10;
		
		for(int i=1;i<=n;i++) {
			System.out.print(first + " ");
			third = first + second;
			first=second;
			second=third;
			
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci obj = new Fibonacci();
		obj.FindFibonacci();
	}

}
