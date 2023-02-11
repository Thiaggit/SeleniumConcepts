package set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public void TreeSetEx() {
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("Z");
		set.add("E");
		set.add("Q");
		set.add("A");
		set.add("F");
		set.add("L");
		
		System.out.println(set);
		
		System.out.println(set.first());
		
		System.out.println(set.last());
		//Headset - returns elements bigger or higher precedence
		System.out.println(set.headSet("Q"));
		//Tailset- Returns the given elements and lesser or lower precedence
		System.out.println(set.tailSet("L"));
		
		System.out.println(set.subSet("A", "L"));
		//Retrieves first element and deletes it
		System.out.println(set.pollFirst());
		//Retrieves last element and deletes it
		System.out.println(set.pollLast());
		
		System.out.println(set);
	}
	
	public void TreeSetExIteration() {
		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Z");
		set1.add("E");
		set1.add("Q");
		set1.add("A");
		set1.add("F");
		set1.add("L");
		
		Iterator<String> itr = set1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSetExample obj = new TreeSetExample();
		obj.TreeSetEx();
		obj.TreeSetExIteration();
	}

}
