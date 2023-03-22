package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ReversingArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creating an ArrayList object
		ArrayList < String > arrlist = new ArrayList < String > ();

		//Adding elements to ArrayList object
		arrlist.add("Nokia");
		arrlist.add("Samsung");
		arrlist.add("iPhone");
		arrlist.add("One+");

		//Displaying ArrayList Before Reverse
		System.out.println("Before Reverse ArrayList:");
		System.out.println(arrlist);

		/*Reversing the list using
		Collections.reverse() method*/
		Collections.reverse(arrlist);

		//Displaying list after reverse
		System.out.println("After Reverse ArrayList:");
		System.out.println(arrlist);
		}
	
}
