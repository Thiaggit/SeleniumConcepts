package arithmetic;

import java.util.Scanner;

public class ReverseANumber {

	public void ReversingANumber() {
		int given = 654;
		int reverse = 0;
		Scanner sc = new Scanner(System.in);		
		given = sc.nextInt();
		while (given!=0) {
			reverse=reverse*10;
			reverse=reverse+given%10;
			given=given/10;			
		}
		System.out.println("The reversed integer is " + reverse);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseANumber obj = new ReverseANumber();
		obj.ReversingANumber();
	}

}
