package arraysPractice1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemovingDuplicatesinArray {
	
	public void duplicateRemove() {
		int a1[] = {1,1,2,23,5,8,8,7};
		
		Set<Integer> hs = new HashSet<Integer>();
		
		for (Integer integer : a1) {
			hs.add(integer);
		}
		
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemovingDuplicatesinArray obj = new RemovingDuplicatesinArray();
		obj.duplicateRemove();
	}

}
