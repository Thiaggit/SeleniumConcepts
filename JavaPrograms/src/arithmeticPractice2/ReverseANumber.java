package arithmeticPractice2;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int given = 123;
	
		int reverse = 0;
		
		while(given>0) {
			reverse = reverse*10;
			reverse = reverse+given%10;
			given=given/10;
		}
		
		System.out.println(reverse);
		
	}

}
