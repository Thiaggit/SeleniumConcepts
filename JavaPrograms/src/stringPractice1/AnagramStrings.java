package stringPractice1;

import java.util.Arrays;

public class AnagramStrings {
	
	public void StringAnagramOrNot() {
		String str1 = "army";
		String str2 = "mary";
		
		char[] strArr1 = str1.toLowerCase().toCharArray();
		char[] strArr2 = str2.toLowerCase().toCharArray();
		
		Arrays.sort(strArr1);
		Arrays.sort(strArr2);
		
		if(Arrays.equals(strArr1, strArr2)) {
			System.out.println("The arrays are anagram");
		}else {
			System.out.println("The arrays are not anagram");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnagramStrings obj = new AnagramStrings();
		obj.StringAnagramOrNot();
	}

}
