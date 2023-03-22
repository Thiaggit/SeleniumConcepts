package arraysPractice1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsArray {
	
	public void findingDuplicatesUsingSort() {
		int a1[] = {1,1,23,54,5,5,6};
		int num = a1.length;
		Arrays.sort(a1);
		
		for(int i=0;i<num;i++) {
			if(a1[i]==a1[i+1]) {
				System.out.println("The duplicate element found are" + a1[i]);
			}
		}
	}
	
	public void findDuplicateUsingSet() {
		int a1[] = {1,1,23,54,5,5,6};
		
		Set<Integer> hs = new HashSet<Integer>();
		
		for (Integer integer : a1) {
			if(!hs.add(integer)) {
				System.out.println("The duplicate elements are " + integer);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateElementsArray obj = new DuplicateElementsArray();
//		obj.findingDuplicatesUsingSort();
		obj.findDuplicateUsingSet();
	}

}
