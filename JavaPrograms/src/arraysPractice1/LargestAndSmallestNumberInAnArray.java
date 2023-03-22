package arraysPractice1;

public class LargestAndSmallestNumberInAnArray {
	
	public void LargestNumberInArray() {
		int a1[] = {1,2,3,4,5,6};
		
		int largestNumber = Integer.MIN_VALUE;
		
		for(int i=0;i<a1.length;i++) {
			if(a1[i]>largestNumber) {
				largestNumber=a1[i];
			}
		}
		System.out.println("The largest number is " + largestNumber);
	}
	
	public void SmallestNumberInArray() {
		int a1[] = {1,2,3,4,5,6};
		
		int smallestNumber = Integer.MAX_VALUE;
		
		for(int i=0;i<a1.length;i++) {
			if(a1[i]<smallestNumber) {
				smallestNumber=a1[i];
			}
		}
		System.out.println("The largest number is " + smallestNumber);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestAndSmallestNumberInAnArray obj = new LargestAndSmallestNumberInAnArray();
		obj.LargestNumberInArray();
		obj.SmallestNumberInArray();
	}

}
