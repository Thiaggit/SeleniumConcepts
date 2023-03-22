package arrays;

public class ReverseAnArray {
	
	public void ReversingArray() {
		int a1[] = {1,2,3,4,5};
		
		for(int i=a1.length-1;i>=0;i--) {
			System.out.print(a1[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAnArray obj = new ReverseAnArray();
		obj.ReversingArray();
	}

}
