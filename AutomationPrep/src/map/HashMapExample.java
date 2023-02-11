package map;

import java.util.HashMap;

public class HashMapExample {

	public void HashMapEx() {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
		map.put(5, "E");
		map.put(6, "F");
		
		System.out.println(map);
		
		HashMap<Integer, String> duplicatemap = new HashMap<Integer, String>();
		duplicatemap.putAll(map);
		System.out.println(duplicatemap);
		duplicatemap.clear();
		System.out.println(duplicatemap);
		
		System.out.println(map.containsKey(1));
		System.err.println(map.containsValue("J"));
		System.err.println(map.isEmpty());
		
		System.out.println(map.keySet());//returns all the keys
		System.out.println(map.values());//returns all the values
		System.out.println(map.entrySet());//returns all the entries with both key values
		System.out.println(map.get(1));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMapExample obj = new HashMapExample();
		obj.HashMapEx();
	}

}
