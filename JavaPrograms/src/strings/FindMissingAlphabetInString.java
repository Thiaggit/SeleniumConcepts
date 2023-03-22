package strings;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabetInString {
	
	public void missingAlphabet() {
		String str = "How are you";
		
		str=str.toLowerCase();
		
		str=str.replaceAll(" ", "");
		
		String[] strArr = str.split("");
		
		String[] strArr1 = "abcdefghijklmnopqrstuvwxyz".split("");
		
		HashSet<String> set1 = new HashSet<String>(Arrays.asList(strArr));
		
		HashSet<String> set2 = new HashSet<String>(Arrays.asList(strArr1));
		
		set2.removeAll(set1);
		
		System.out.println(set2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMissingAlphabetInString obj = new FindMissingAlphabetInString();
		obj.missingAlphabet();
	}

}
