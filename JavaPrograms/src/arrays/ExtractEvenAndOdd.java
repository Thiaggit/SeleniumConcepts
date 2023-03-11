package arrays;

import java.util.Scanner;

public class ExtractEvenAndOdd {
	
	public void ExtractingEvenAndOddUsingForLoop() {
		int given[] = {1,2,3,4,5,6,7,8,9};
		
		//To find Even numbers
		for(int i = 0;i<given.length;i++) {
			if(given[i]%2==0) {
				System.out.println("The even numbers are " + given[i]);
			}
		}
		
		//To find Odd numbers
		for(int i = 0;i<given.length;i++) {
			if(given[i]%2!=0) {
				System.out.println("The odd numbers are " + given[i]);
			}
		}
	}
	
	public void ExtractingEvenAndOddUsingForEach() {
		int given[] = {1,2,3,4,5,6,7,8,9};
		
		//To find Even numbers
		for (int i : given) {
			if(i%2==0) {
				System.out.println("The even numbers are " + i);
			}
		}
		
		//To find Odd numbers
		for (int i : given) {
			if(i%2!=0) {
				System.out.println("The odd numbers are " + i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtractEvenAndOdd obj = new ExtractEvenAndOdd();
		//obj.ExtractingEvenAndOddUsingForLoop();
		obj.ExtractingEvenAndOddUsingForEach();
	}

}
