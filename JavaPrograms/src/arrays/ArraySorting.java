package arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySorting {
	
	public void SortingAnArray() {
		int given[] = {10,20,50,5,8,7,9,92};
		System.out.println("Arrays before sorting " + Arrays.toString(given));
		int n = given.length;
		for(int i=0;i<n-1;i++) {  //No of Passes
			for(int j=0;j<n-1;j++) { // No of Iterations
				if(given[j]>given[j+1]) {
					int temp = given[j];
					given[j]=given[j+1];
					given[j+1] = temp;
				}
			}
		}
		System.out.println("Arrays after sorting " + Arrays.toString(given));
	}

	public void SortingAnArrayUsingInbuiltMethods() {
		int given[] = {10,20,50,5,8,7,9,92};
		System.out.println("Arrays before sorting " + Arrays.toString(given));
		//To sort ascending
		Arrays.sort(given);
		System.out.println("Arrays after sorting " + Arrays.toString(given));
		
		//To Sort Descending
		Integer given2[] = {10,20,50,5,8,7,9,92};
		System.out.println("Arrays before sorting " + Arrays.toString(given2));
		Arrays.sort(given2,Collections.reverseOrder());
		System.out.println("Arrays after sorting " + Arrays.toString(given2));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySorting obj = new ArraySorting();
		obj.SortingAnArray();
		obj.SortingAnArrayUsingInbuiltMethods();
	}

}
