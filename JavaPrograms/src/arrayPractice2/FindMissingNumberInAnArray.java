package arrayPractice2;

public class FindMissingNumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int given[]= {1,2,3,5,6,7,8,9,10};
		int sum = 0;
		int expectedSum = 0;
		
		for(int i=0;i<given.length;i++) {
			sum = sum+given[i];
		}
		
		for(int j=0;j<=10;j++) {
			expectedSum = expectedSum+j;
		}
		
		System.out.println("The missing number is " + (expectedSum-sum));
	}

}
