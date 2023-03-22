package strings;

public class FirstNonRepeatingCharacter {

	public void findingnonRepeatingChar() {
		String str = "window";
		
		for(int i=0;i<str.length();i++) 
		{
			char ch = str.charAt(i);
			boolean repeat = false;
			for(int j=i+1;j<str.length();j++) 
			{
				    if(ch==str.charAt(j)) 
				    {
					repeat = true;
					break;
				    }
			}
			if(repeat==false) {
				System.out.println(ch+ " first non repeated");
				break;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();
		obj.findingnonRepeatingChar();
	}

}
