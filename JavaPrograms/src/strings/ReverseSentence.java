package strings;

public class ReverseSentence {
	
	public void SentenceReverse() {
		
		String given = "Today is a good day";
		
		String reverse = "";
		
		String[] temp = given.split(" ");
		
		for(int i=temp.length-1;i>=0;i--) {
			
			reverse = reverse+temp[i];
			
		}
		
		System.out.println("The reversed string is " + reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseSentence obj = new ReverseSentence();
		obj.SentenceReverse();
	}

}
