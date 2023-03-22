package stringPractice1;

public class StringLength {
	
	public void LengthOfString() {
		String str = "Thiagarajan";
		
		int length=0;
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			length++;
		}
		System.out.println(length);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringLength obj = new StringLength();
		obj.LengthOfString();
	}

}
