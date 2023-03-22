package stringPractice1;

public class PalindromeString {

	public void StringPalindrome() {
		String str = "madam";
		
		String reverse="";
		
		String palindromeStr = str;
		
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			reverse = reverse+ch[i];
		}
		if(reverse.equals(palindromeStr)) {
			System.out.println("The String is a Palindrome");
		}else {
			System.out.println("The String is not a Palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeString obj = new PalindromeString();
		obj.StringPalindrome();
	}

}
