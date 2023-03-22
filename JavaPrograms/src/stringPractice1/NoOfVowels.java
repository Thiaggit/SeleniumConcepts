package stringPractice1;

public class NoOfVowels {
	
	public void FindingNoOfVowels() {
		String str = "Thiagarajan";
		
		int noOfVowels=0;
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				noOfVowels++;
			}
		}
		System.out.println(noOfVowels);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoOfVowels obj = new NoOfVowels();
		obj.FindingNoOfVowels();
	}

}
