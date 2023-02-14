package set;

import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import java.util.*;

public class HashSetExample {
	
	public void HashSetEx() {
		
		HashSet<String> set = new HashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("A");
		set.add(null);
		
		//Here null insertion will not happen
		//And duplicate A also not considered
		System.out.println(set);
	}
	
	public void HashsetIteration() {
		
		HashSet<String>set1 = new HashSet<String>();
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
	    	break;
	    }
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSetExample obj = new HashSetExample();
		obj.HashSetEx();
		obj.HashsetIteration();
	}

}
