package strings;

public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder name = new StringBuilder("Thiagarajan");
		
		System.out.println(name.reverse());
		
		System.out.println(name.replace(0, 5, "Bubbly"));
		
		System.out.println(name.delete(0, 3));
		
		System.out.println(name.insert(4, "good"));
		
		System.out.println(name.append("Gur"));
		
		//STring Builder also has the same methods as StringBuffer
		
	}

}
