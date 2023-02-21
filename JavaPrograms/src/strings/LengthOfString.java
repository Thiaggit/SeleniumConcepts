package strings;

public class LengthOfString {

	public void StringLength() {
		
		String given = "Thiagarajan";
		
		int length = 0;
		
		char[] temp = given.toCharArray();
		
		for(int i=0;i<temp.length;i++) {
			length++;
		}
		
		System.out.println("The Length of the string is " + length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LengthOfString obj = new LengthOfString();
		obj.StringLength();
	}

}
