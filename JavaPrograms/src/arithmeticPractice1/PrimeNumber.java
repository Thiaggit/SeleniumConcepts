package arithmeticPractice1;

public class PrimeNumber {
	
	public void findingPrimeNumbers() {
		int num = 6;
		int count = 0;
		
		if(num>1) {
			
			for(int i=1;i<=num;i++) {
				if(num%i==0)
					count++;
			}
				if(count==2) {
					System.out.println("The given number is a prime number");
				}else {
					System.out.println("The given number is not a prime number");
				}
			}
			
		else {
			System.out.println("The given number is not prime number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj = new PrimeNumber();
		obj.findingPrimeNumbers();
	}

}
