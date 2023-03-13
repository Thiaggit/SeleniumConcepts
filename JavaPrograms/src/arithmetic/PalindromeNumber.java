package arithmetic;

import java.util.Scanner;

public class PalindromeNumber {

	public void FindPalindrome() {
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter a number");
		int given = sc.nextInt();
		int org_num=given;
		int reverse = 0;
	
		while(given!=0) {
			reverse=reverse*10;
			reverse=reverse+given%10;
			given=given/10;
		}

		if(org_num==reverse) {
			System.out.println("The number is palindrome");
		}else {
			System.out.println("The number is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber obj = new PalindromeNumber();
		obj.FindPalindrome();
	}

}
