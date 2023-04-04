package arithmeticPractice2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int given = 121;
		int temp = given;
		int reverse = 0;
		
		while(given>0) {
			reverse = reverse*10;
			reverse = reverse+given%10;
			given=given/10;
		}
		
		if(reverse==temp) {
			System.out.println("The number is a palindrome");
		}else {
			System.out.println("The number is not palindrome");
		}
	}

}
