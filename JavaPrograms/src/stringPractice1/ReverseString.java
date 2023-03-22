package stringPractice1;

public class ReverseString {

	public void ReversingAString() {
		String str = "Thiagarajan";
		
		String reverse="";
		
		char[] ch =str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--) {
			reverse = reverse+ch[i];
		}
		System.out.println(reverse);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString obj = new ReverseString();
		obj.ReversingAString();
	}

}
