package statickeyword;

public class StaticBlocks {
/* The static blocks has highest order of precedence than main method */
	static{
		System.out.println("One");
		
	}
	
	static{
		System.out.println("Two");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");
	}

}
