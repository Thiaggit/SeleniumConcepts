package stringPractice1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateWords {

	public void DuplicateWordsRemove() {
		String str = "I am am rahul rahul";
		
		String[] strArr = str.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		
		for (String string : strArr) {
			set.add(string);
		}
		
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemovingDuplicateWords obj = new RemovingDuplicateWords();
		obj.DuplicateWordsRemove();
	}

}
