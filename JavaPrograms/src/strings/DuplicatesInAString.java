package strings;

public class DuplicatesInAString {

	public void FindingDuplicates() {
		String str = "How are you Thiagarajan";
		
		int count;
		
		str = str.toLowerCase();
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<ch.length;i++) {
			count = 1;
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&&ch[i] != ' ') {
					count++;
					ch[j]='0';
				}
			}
			
			if(count>1 && ch[i] != '0') {
				System.out.println(ch[i]);
			}
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicatesInAString obj = new DuplicatesInAString();
		obj.FindingDuplicates();
	}

}
