package map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMapExample {
	
	public void TreeMapEx() {
		
		 TreeMap<Integer, String> map = new  TreeMap<Integer, String>();
			map.put(1, "A");
			map.put(2, "B");
			map.put(3, "C");
			map.put(4, "D");
			map.put(5, "E");
			map.put(6, "F");
		//	map.put(null, "G");
			
			System.out.println(map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMapExample obj = new TreeMapExample();
		obj.TreeMapEx();
	}

}
