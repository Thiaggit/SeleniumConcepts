package strings;

import java.util.Arrays;

public class AnagramStrings {
	
	public void FindingAnagram() {
		
		String str1 = "army";
		String str2 = "mary";
		
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("The given strings are anagram");
		}else {
			System.out.println("The given strings are not anagram");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnagramStrings obj = new AnagramStrings();
		obj.FindingAnagram();
	}

}
