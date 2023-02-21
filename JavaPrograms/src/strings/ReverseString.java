package strings;

public class ReverseString {

	//Here we are going to reverse a string without using reverse function
	
	public void StringReverse() {
		String given = "Thiagarajan";
		
		String reverse = "";
		
		char[] temp = given.toCharArray();
		
		for(int i = temp.length-1;i>=0;i--) {
			reverse = reverse+temp[i];
		}
		
		System.out.println("The Reversed String is " + reverse);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReverseString obj = new ReverseString();
		obj.StringReverse();
	}

}
