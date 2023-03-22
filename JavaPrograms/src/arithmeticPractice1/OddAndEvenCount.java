package arithmeticPractice1;

public class OddAndEvenCount {
	
	public void findingOddEven() {
		int num = 1234567;
		int odd_count = 0;
		int even_count = 0;
		
		while(num!=0) {
			int rem = num%10;
			if(rem%2==0) {
				even_count++;
			}else {
				odd_count++;
			}
			num = num/10;
		}
		System.out.println("The even and odd count are " + even_count + " " + odd_count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddAndEvenCount obj = new OddAndEvenCount();
		obj.findingOddEven();
	}

}
