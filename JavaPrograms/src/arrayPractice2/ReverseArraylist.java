package arrayPractice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Collections.reverse(list);
		
		System.out.println(list);
	}

}
