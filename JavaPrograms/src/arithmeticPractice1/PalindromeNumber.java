package arithmeticPractice1;

import java.util.Scanner;

public class PalindromeNumber {
	
	public void findPalindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();		
		int reverse = 0;
		int palindromeNo=num;
		while(num!=0) {
			reverse = reverse*10;
			reverse = reverse+num%10;
			num = num/10;
		}
		
		if(palindromeNo==reverse) {
			System.out.println("The given number is palindrome");
		}else {
			System.out.println("The given number is not palindrome");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeNumber obj = new PalindromeNumber();
		obj.findPalindrome();
	}

}
