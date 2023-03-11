package arrays;

public class FindMissingNumberInAnArray {
	
	public void MissingNumber() {
		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMissingNumberInAnArray obj = new FindMissingNumberInAnArray();
		obj.MissingNumber();
	}

}
