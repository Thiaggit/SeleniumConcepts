package arithmeticPractice1;

import java.util.Scanner;

public class ReverseNumber {
	
	public void reversingANumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int given = sc.nextInt();
		int reverse = 0;
		
		while(given!=0) {
			reverse = reverse*10;
			reverse = reverse+given%10;
			given = given/10;		
		}
		
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber obj = new ReverseNumber();
		obj.reversingANumber();
	}

}
