package strings;

public class ExtractNumberFromString {

	public void ExtractingNumber() {
		String given = "Thiagarajan42";
		
		int count = 0;
		
		for(int i=0;i<given.length();i++) {
			
			char character = given.charAt(i);
			
			if(Character.isDigit(character)) {
				count=count+Character.getNumericValue(character);
			}
		}
		
		System.out.println("The sum of the numbers are " + count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExtractNumberFromString obj = new ExtractNumberFromString();
		obj.ExtractingNumber();
	}

}
