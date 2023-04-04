package arithmeticPractice2;

public class OddandEven {

	public void findOddANdEven() {
		int num = 123456;
		int odd_count=0;
		int even_count = 0;
		
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				even_count++;
			}else {
				odd_count++;
			}
			num=num/10;
		}
		System.out.println("The odd count is " + odd_count);
		
		System.out.println("The even count is " + even_count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddandEven obj = new OddandEven();
		obj.findOddANdEven();
	}

}
