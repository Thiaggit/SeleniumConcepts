package strings;

public class NoOfOccurrence {
	
	//Here we are going to find no of occurrence of any character in a string
	
	NoOfOccurrence(){
		String given = "Thiagarajan";
		
		char toFind = 't';
		
		int occurrence=0;
		
		given = given.toLowerCase();
		
		for(int i=0;i<given.length();i++) {
			if(given.charAt(i)==toFind) {
				occurrence = occurrence+1;
			}
		}
		
		System.out.println("The no of occurrence of the character is " + occurrence);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NoOfOccurrence obj = new NoOfOccurrence();
	}

}
