package arithmeticPractice1;

import java.util.Scanner;

public class SumofDigits {

	public void findSumOfdigits() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = 0;
		
		while(num!=0) {
			sum= sum+num%10;
			num = num/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumofDigits obj = new SumofDigits();
		obj.findSumOfdigits();
	}

}
