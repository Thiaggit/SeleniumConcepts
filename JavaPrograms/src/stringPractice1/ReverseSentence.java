package stringPractice1;

public class ReverseSentence {
	
	public void ReversingASentence() {
		String str = "How are you";
		
		String[] strArr=str.split(" ");
		
		String reverse="";
		
		for(int i=strArr.length-1;i>=0;i--) {
			reverse=reverse+strArr[i];
		}
		System.out.println(reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseSentence obj = new ReverseSentence();
		obj.ReversingASentence();
	}

}
