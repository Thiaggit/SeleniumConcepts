package arithmetic;

public class PrimeNumberOrNot {
	
	public void FindingPrimeorNot() {
		int num = 2;
		int count = 0;
		
		if(num>1) 
		{
			for(int i=1;i<=num;i++) 
			{
				if(num%i==0) 
					count++;
			}
			if(count==2) {
					System.out.println("The given number is prime number");
					
				}else {
					System.out.println("The given number is not prime number");
					
				}
		}else {
			System.out.println("The number is not a prime number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberOrNot obj = new PrimeNumberOrNot();
		obj.FindingPrimeorNot();
	}

}
