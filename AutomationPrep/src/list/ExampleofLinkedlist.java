package list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ExampleofLinkedlist {

	
	public void linkedlistEx() {
		
		LinkedList<String> defenders = new LinkedList<String>();
		defenders.add("AWB");
		defenders.add("Varane");
		defenders.add("Lindelof");
		defenders.add("Licha");
		defenders.add("Shaw");
		defenders.add("Shaw");
		defenders.add("Lindelof");
		defenders.add("Alex");
		
		defenders.addFirst("Bailly");
		System.out.println(defenders);
		 
		defenders.addLast("Maguire");
		System.out.println(defenders);
		
		defenders.removeFirst();
		System.out.println(defenders);
		
		defenders.removeLast();
		System.out.println(defenders);
		
		//poll - used to delete first element
		//poll last - used to delete last element
		defenders.poll();
		System.out.println(defenders);
		
		defenders.pollLast();
		System.out.println(defenders);
		
		defenders.removeFirstOccurrence("Shaw");
		System.out.println(defenders);
		
		defenders.removeLastOccurrence("Lindelof");
		System.out.println(defenders);
		
		System.out.println(defenders.getFirst());
		System.out.println(defenders.getLast());
		System.out.println(defenders.get(3));		
	}
	
	public void linkedlistIteratorEx() {
		//ITERATION
				LinkedList<String> list = new LinkedList<String>();
				list.add("a");
				list.add("b");
				list.add("c");
				list.add("d");
				list.add("e");
				
				//for loop
				for(int i=0;i<list.size();i++) {
					System.out.println(list.get(i));
				}
				
				//for-each
				for (String string : list) {
					System.out.println(string);
				}
				
				//iterator
				ListIterator<String> itr = list.listIterator();
				while(itr.hasNext()) {
					System.out.println(itr.next());
				}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleofLinkedlist obj = new ExampleofLinkedlist();
		//obj.linkedlistEx();
		obj.linkedlistIteratorEx();
	}

}
