package list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExampleofArraylist {

	public void arraylistEx() {
		
		List<String> midfield = new ArrayList<String>();
		midfield.add("Bruno");
		midfield.add("Bruno");//Allows Duplicate and insertion order
		midfield.add("Casemiro");
		midfield.add("Eriksen");
		midfield.add("Sabitzer");
		midfield.add("pogba");
		midfield.remove(5);
		midfield.add(null);
		midfield.set(1, "Donny");
				
		System.out.println(midfield.isEmpty());
		System.out.println(midfield.get(2));
		System.out.println(midfield.indexOf("Casemiro"));
		
		List<String> players = new ArrayList<String>();
		players.addAll(midfield); //Used to add all objects from one list to other
		System.out.println(players);
		players.clear();
		
		//Iteration - It can be done in three following methods
		
		for (String string : midfield) {
			System.out.println(string);
		}
		
		for (int i=0;i<midfield.size();i++) {
			System.out.println(midfield.get(i));
		}
		
		ListIterator<String> itr = midfield.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
		 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExampleofArraylist obj = new ExampleofArraylist();
		obj.arraylistEx();
	}

}
