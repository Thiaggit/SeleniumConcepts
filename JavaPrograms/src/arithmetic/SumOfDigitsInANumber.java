package arithmetic;

public class SumOfDigitsInANumber {
	
	public void FindingSum() {
		int num = 1234;
		int sum=0;
		
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("The sum of digits are " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfDigitsInANumber obj = new SumOfDigitsInANumber();
		obj.FindingSum();
	}

}
