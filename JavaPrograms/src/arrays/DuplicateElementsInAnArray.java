package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsInAnArray {
	
	public void findDuplicateUsingBruteForce() {
		int[] given = {1,2,2,6,6,8,8,7,3};
		
		for(int i=0;i<given.length;i++) {
			for(int j=i+1;j<given.length;j++) {
				if(given[i]==given[j]) {
					System.out.println("The duplicate element found are" + given[i]);
				}
			}
		}
	}
	
	public void findDuplicateElementsUsingSort() {
		int[] given = {1,2,2,6,6,8,8,7,3,10,10};
		
		Arrays.sort(given);
		
		for(int i=0;i<given.length;i++) {
			if(given[i]==given[i+1]) {
				System.out.println("The duplicate element found are" + given[i]);
			}
		}
	}
	
	public void findDuplicateElementsUsingSet() {
		int[] given = {1,2,2,6,6,8,8,7,3,10,10};
		
		Set<Integer> hs = new HashSet<Integer>();
		
		for (Integer integer : given) {
			
			if(!hs.add(integer)) {
				System.out.println("The Duplicate element is " + integer);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateElementsInAnArray obj = new DuplicateElementsInAnArray();
		//obj.findDuplicateUsingBruteForce();
		//obj.findDuplicateElementsUsingSort();
		obj.findDuplicateElementsUsingSet();
	}

}
