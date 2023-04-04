package stringPractice2;

import java.util.Arrays;

public class Practice {
	
	public void Anagram() {
		String str1 = "mary";
		String str2 = "Army";
		char[] str1Arr = str1.toLowerCase().toCharArray();
		char[] str2Arr = str2.toLowerCase().toCharArray();
		Arrays.sort(str2Arr);
		Arrays.sort(str1Arr);
		
		if(Arrays.equals(str1Arr, str2Arr)) {
			System.out.println("The Strings are anagram");
		}
		else {
			System.out.println("The Strings are not anagram");
		}
	}
	
	public void ExtractNumber() {
		String str = "Thiagarajan42";
		
		int addition = 0;
		
		for(int i=0;i<str.length();i++) {
			Character ch = str.charAt(i);
			
			if(Character.isDigit(ch)) {
				addition=addition+Character.getNumericValue(ch);
			}
		}
		System.out.println(addition);
	}
	
	public void lengthofString() {
		String str = "Thiagarajan";
		
		int length=0;
		
		for(int i=0;i<str.length();i++) {
			length++;
		}
		System.out.println(length);
	}

	public void NoOfOccurrence() {
		String str = "Thiagarajan";
		
		int occurrence = 0;
		
		char toFind = 'a';
		
		str=str.toLowerCase();
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==toFind) {
				occurrence++;
			}
		}
		System.out.println(occurrence);
	}
	
	public void NoofVowels() {
		String str = "Thiagarajan";
		
		int noOfVowels = 0;
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				noOfVowels++;
			}
		}
		System.out.println(noOfVowels);
		
	}
	
	public void Palindrome() {
		String str1 = "madam";
		
		String str2=str1;
		
		String reverse="";
		
		char[] ch = str1.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			reverse=reverse+ch[i];
		}
		
		if(reverse.equals(str2)) {
			System.out.println("This is a palindrome string");
		}
		else {
			System.out.println("This is not a palindrome string");
		}
	}
	
	public void RemoveJunk() {
		String str = "@!*&# How are you";
		
		String str1 = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str1);
	}
	
	public void RemoveLeadingandTrailingWhitespaces() {
		String str1 = " madam ";
		
		String str2 = str1.replaceAll("^[ \t]+|[ \t]+$", "");
		
		System.out.println(str2);
	}
	
	public void ReplaceVowelsWithSpecialCharacter() {
		String str = "Thiagarajan";
		
		str=str.toLowerCase();
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				ch[i]='*';
			}
		}
		for(int i=0;i<str.length();i++) {
			System.out.print(ch[i]);
		}					
	}
	
	public void ReverseEachWord() {
		String str = "How are you";
		
		String result="";
		
		String[] strArr = str.split("\\s");
				
		for (String string : strArr) {
			String reverse="";
			
			int j=string.length()-1;
			while(j>=0) {
				reverse=reverse+string.charAt(j);
				j--;
			}
			
			result=result+reverse;
		}
		System.out.println(result);
	}
	
	public void ReverseSentence() {
		String str = "How are you";
		
		String reverse="";
		
		String[] strArr = str.split("\\s");
		
		for(int i=strArr.length-1;i>=0;i--) {
			reverse=reverse+strArr[i];
		}
		System.out.println(reverse);
	}
	
	public void ReverseString() {
        String str = "Thiagarajan";
		
		String reverse="";
		
		char[] ch = str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			reverse=reverse+ch[i];
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice obj = new Practice();
//		obj.Anagram();
//		obj.ExtractNumber();
//		obj.lengthofString();
//		obj.NoOfOccurrence();
//		obj.NoofVowels();
//		obj.Palindrome();
//		obj.RemoveJunk();
//		obj.RemoveLeadingandTrailingWhitespaces();
//		obj.ReplaceVowelsWithSpecialCharacter();
//		obj.ReverseEachWord();
//		obj.ReverseSentence();
		obj.ReverseString();
	}

}
