package arithmeticPractice1;

import java.util.Scanner;

public class LargestofThreeNumbers {

	public void findLargestNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		
		System.out.println("Enter the third number");
		int c = sc.nextInt();
		
		if (a>b&&a>c) {
			System.out.println("A is the largest number");
		} else if(b>a&&b>c){
            System.out.println("B is the largest number");
		} else {
			System.out.println("C is the largest number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestofThreeNumbers obj = new LargestofThreeNumbers();
		obj.findLargestNumber();
	}

}
