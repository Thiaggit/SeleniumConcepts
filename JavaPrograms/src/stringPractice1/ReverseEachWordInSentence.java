package stringPractice1;

public class ReverseEachWordInSentence {
	
	public void ReversingEachWordInSentence() {
		String str = "How are you";
		
		String reverseWord="";
		
		String result="";
		
		String[] strArr=str.split("\\s");
		
		for (String string : strArr) {
			
			char[] ch = string.toCharArray();
			
			for(int i=ch.length-1;i>=0;i--) {
				reverseWord=reverseWord+ch[i];
			}
		}
		result = result+reverseWord+ " ";
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseEachWordInSentence obj = new ReverseEachWordInSentence();
		obj.ReversingEachWordInSentence();
	}

}
