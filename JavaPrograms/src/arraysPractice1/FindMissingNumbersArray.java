package arraysPractice1;

public class FindMissingNumbersArray {
	
	public void FindingMissingNumber() {
		int a1[] = {1,2,3,4,5,7,8,9,10};
		int sum = 0;
		int expectedSum = 0;
		
		for(int i=0;i<a1.length;i++) {
			sum = sum+a1[i];
		}
		
		for(int j=0;j<=10;j++) {
			expectedSum = expectedSum+j;
		}
		
		System.out.println("The missing number is " + (expectedSum-sum));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMissingNumbersArray obj = new FindMissingNumbersArray();
		obj.FindingMissingNumber();
	}

}
