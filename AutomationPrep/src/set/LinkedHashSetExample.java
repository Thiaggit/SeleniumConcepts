package set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	  public void LinkedHashSetEx() {
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("A");
		set.add(null);
		
		//Insertion order will maintain but not duplicate
		
		System.out.println(set);
	  }
	
     public void LinkedHashsetIteration() {
		
    	LinkedHashSet<String> set1 = new LinkedHashSet<String>();
 		set1.add("A");
 		set1.add("B");
 		set1.add("C");
 		set1.add("D");
 		set1.add("E");
 		set1.add("A");
 		set1.add(null);

		
	    java.util.Iterator<String> ite = set1.iterator();
	    while(ite.hasNext()) {
	    	System.out.println(ite.next());
	    }
	    
     }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSetExample obj = new LinkedHashSetExample();
		obj.LinkedHashSetEx();
		obj.LinkedHashsetIteration();
	}

}
