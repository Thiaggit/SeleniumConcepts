package stringPractice1;

public class Occurrence {
	
	public void FindingNoofOccurrence() {
		String str = "Thiagarajan";
		
		int occurrence=0;
		
		char toFind = 'a';
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==toFind) {
				occurrence++;
			}
		}
		System.out.println(occurrence);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Occurrence obj = new Occurrence();
		obj.FindingNoofOccurrence();
	}

}
