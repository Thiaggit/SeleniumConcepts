package stringPractice1;

public class ExtractNumber {
	
	public void ExtractingNumberFromString() {
		String str1 = "Thiagarajan42";
		
		int addition=0;
		
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			if(Character.isDigit(ch)) {
				addition=addition+Character.getNumericValue(ch);
			}
		}
		System.out.println(addition);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtractNumber obj = new ExtractNumber();
		obj.ExtractingNumberFromString();
	}

}
