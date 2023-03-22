package arithmeticPractice1;

import java.util.Scanner;

public class Factorial {

	public void findFactorial() {
		int num = 6;
//		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact = fact*i;
		}
		System.out.println("The factorial for given number is "+ fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj = new Factorial();
		obj.findFactorial();
	}

}
