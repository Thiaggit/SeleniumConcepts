package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public void LinkedHashMapEx() {
		
    LinkedHashMap<Integer, String> map = new  LinkedHashMap<Integer, String>();
	map.put(1, "A");
	map.put(2, "B");
	map.put(3, "C");
	map.put(4, "D");
	map.put(5, "E");
	map.put(6, "F");
	
	System.out.println(map);
	
	//The methods are same as HashMap
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMapExample obj = new LinkedHashMapExample();
		obj.LinkedHashMapEx();
	}

}
