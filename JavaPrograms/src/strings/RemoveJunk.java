package strings;

public class RemoveJunk {
	
	public void removingJunk() {
		String str = "%*^*^^&#@! How are you";
		
		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveJunk obj = new RemoveJunk();
		obj.removingJunk();
	}

}
