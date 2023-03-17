package strings;

public class ReverseEachWordInASentence {

	public void ReverseWords() {
		
		String str = "How are you";
		
		String result="";
		
		String[] strArr = str.split("\\s");
		
		for (String string : strArr) {
			
			String reverseWord="";
			int j = string.length()-1;
			
			while(j>=0) {
				char ch = string.charAt(j);
				reverseWord=reverseWord+ch;
				j--;
			}
			
			result = result+reverseWord+" ";
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseEachWordInASentence obj = new ReverseEachWordInASentence();
		obj.ReverseWords();
	}

}
