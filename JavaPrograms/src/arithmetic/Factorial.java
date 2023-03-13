package arithmetic;

import java.util.Scanner;

public class Factorial {

	public void FindFactorial() {
		
		int n = 4;
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("The factorial of the given number is " + fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial obj =  new Factorial();
		obj.FindFactorial();
	}

}
