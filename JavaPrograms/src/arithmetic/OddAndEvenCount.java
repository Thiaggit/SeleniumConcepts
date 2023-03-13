package arithmetic;

public class OddAndEvenCount {

	public void FindOddandEvenCount() {
		int num = 1234;
		int odd_count=0;
		int even_count=0;
		
		while(num>0) {
			int remainder = num%10;
			if(remainder%2==0) {
				even_count++;
			}else
			{
				odd_count++;
			}
			num = num/10;
		}
		System.out.println("The odd count is " + odd_count);
		System.out.println("The even count is " + even_count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddAndEvenCount obj = new OddAndEvenCount();
		obj.FindOddandEvenCount();
	}

}
