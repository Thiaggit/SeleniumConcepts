package arrayPractice2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateElementsInArray {
	
	public void findingDuplicateUsingSort() {
		int a1[] = {1,1,2,4,6,7,7,5,4};
		
		Arrays.sort(a1);
		
		for(int i=0;i<a1.length;i++) {
			if(a1[i]==a1[i+1]) {
				System.out.println("The duplicate elements are " + a1[i]);
			}
		}
	}
	
	public void findingDuplicatesUsingSet() {
		int a1[] = {1,1,2,4,6,7,7,5,4};
		
		Set<Integer> hs = new HashSet<Integer>();
		
		for (Integer integer : a1) {
			if(!hs.add(integer)) {
				System.out.println(integer);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateElementsInArray obj = new DuplicateElementsInArray();
//		obj.findingDuplicateUsingSort();
		obj.findingDuplicatesUsingSet();
	}

}
