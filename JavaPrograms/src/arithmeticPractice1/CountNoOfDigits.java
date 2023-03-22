package arithmeticPractice1;

public class CountNoOfDigits {
	
	public void DigitsCount() {
		int num = 123456;
		int count = 0;
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNoOfDigits obj = new CountNoOfDigits();
		obj.DigitsCount();
	}

}
