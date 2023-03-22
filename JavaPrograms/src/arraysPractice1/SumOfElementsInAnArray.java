package arraysPractice1;

public class SumOfElementsInAnArray {
	
	public void SumOfElements() {
		int a1[] = {1,2,3,5,6};
		int sum = 0;
		
		for(int i=0; i<a1.length;i++) {
			sum= sum+a1[i];
		}
		System.out.println("The sum of the array is " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfElementsInAnArray obj = new SumOfElementsInAnArray();
		obj.SumOfElements();
	}

}
