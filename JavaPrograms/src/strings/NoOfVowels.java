package strings;

public class NoOfVowels {
	
	public void NoOfVowelsPresent() {
		
		String given = "aeiou";
		
		int noOfVowels = 0;
		
		given = given.toLowerCase();
		
		for(int i=0;i<given.length();i++) {
			if(given.charAt(i)=='a' || given.charAt(i)=='e' || given.charAt(i)=='i' || given.charAt(i)=='o' || given.charAt(i)=='u') {
				noOfVowels++;
			}
		}
		
		System.out.println("The No of vowels present in the string are " + noOfVowels);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		NoOfVowels obj = new NoOfVowels();
		obj.NoOfVowelsPresent();
	}

}
