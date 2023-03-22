package strings;

public class ReplaceVowelswithSpecialCharacters {
	
	public void replacingVowels() {
		String str = "Thiagarajan";
		
		char[] strArr = str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A' ||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||
			 str.charAt(i)=='a' ||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				strArr[i]='*';
			}
		}
		for(int i=0;i<strArr.length;i++) {
			System.out.print(strArr[i]);
		}
	}

	public void replacingVowelsUsingPredefinedMethods() {
		String str = "Thiagarajan";
		String strReplaced = str.replaceAll("[AEIOUaeiou]", "*");
		System.out.print(strReplaced);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceVowelswithSpecialCharacters obj = new ReplaceVowelswithSpecialCharacters();
		obj.replacingVowels();
		obj.replacingVowelsUsingPredefinedMethods();
	}

}
