package strings;

public class PalindromeString {
	
	public void findPalindrome() {
		
		String str1 = "madam";
		
		String reverse="";
		
		String str2=str1;
		
		char[] strArr = str1.toCharArray();
		
		for(int i=strArr.length-1;i>=0;i--) {
			reverse=reverse+strArr[i];
		}
		if(reverse.equals(str2)) {
			System.out.println("The String is Palindrome");
		}else {
			System.out.println("The String is not Palindrome");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromeString obj = new PalindromeString();
		obj.findPalindrome();
	}

}
