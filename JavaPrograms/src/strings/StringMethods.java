package strings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Thiagarajan";
		int num = 34;
		
		System.out.println(name.charAt(1));
		
		System.out.println(name.indexOf("g"));
		
		System.out.println(name.isEmpty());
		
		System.out.println(name.substring(1, 3));
		
		System.out.println(name.concat(" Loganathan"));
		
		System.out.println(name.equalsIgnoreCase("thiagarajan loganathan"));
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.length());
		
		System.out.println(name.contains("Th"));
		
		System.out.println(String.valueOf(num));
		
		System.out.println(String.join("/", "10", "02"));
		
		String name2 = "No Guts No Glory";
		String[] temp = name2.split(" ");
		for (String string : temp) {
			System.out.println(string);
		}		
	}

}
