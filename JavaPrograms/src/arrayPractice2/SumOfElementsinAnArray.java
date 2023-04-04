package arrayPractice2;

public class SumOfElementsinAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = {1,2,3,4};
		
		int sum = 0;
		
		for(int i=0;i<a1.length;i++) {
			sum=sum+a1[i];
		}
		System.out.println(sum);
	}

}
