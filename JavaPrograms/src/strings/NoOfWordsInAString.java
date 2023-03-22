package strings;

public class NoOfWordsInAString {
	
	public void WordsinAString() {
		String str = "Welcome to Java";
		
		int count = 1;
		
		for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoOfWordsInAString obj = new NoOfWordsInAString();
		obj.WordsinAString();
	}

}
