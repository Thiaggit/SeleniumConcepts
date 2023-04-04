package arrayPractice2;

public class ExtractEvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = {1,3,4,5,6};
		
		for(int i=0;i<a1.length;i++) {
			if(a1[i]%2==0) {
				System.out.println("The even numbers are " + a1[i]);
			}
		}
		
		for(int i=0;i<a1.length;i++) {
			if(a1[i]%2!=0) {
				System.out.println("The odd numbers are " + a1[i]);
			}
		}
	}

}
