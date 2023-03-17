package strings;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateWords {
	
	public void RemoveDuplicateWords() {
		
		String given = "The black rock black swan";
		
		String[] givenArr = given.split(" ");
		
		Set<String> hs = new LinkedHashSet<String>();
		
		for (String string : givenArr) {
			hs.add(string);
		}
		
		Iterator ite = hs.iterator();
		while(ite.hasNext()) {
			System.out.print(ite.next()+ " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RemovingDuplicateWords obj = new RemovingDuplicateWords();
		obj.RemoveDuplicateWords();
	}

}
