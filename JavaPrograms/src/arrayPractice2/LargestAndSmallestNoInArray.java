package arrayPractice2;

public class LargestAndSmallestNoInArray {
	
	public void largestNumber() {
		int a1[] = {1,2,3,4,5};
		
		int largestNum = Integer.MIN_VALUE;
		
		for(int i=0;i<a1.length;i++) {
			if(a1[i]>largestNum) {
				largestNum=a1[i];
			}
		}
		System.out.println(largestNum);
	}
	
	public void smallestNumber() {
		int a1[] = {1,2,3,4,5};
		
		int smallestNum = Integer.MAX_VALUE;
		
		for(int i=0;i<a1.length;i++) {
			if(a1[i]<smallestNum) {
				smallestNum=a1[i];
			}
		}
		System.out.println(smallestNum);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestAndSmallestNoInArray obj = new LargestAndSmallestNoInArray();
		obj.smallestNumber();
		obj.largestNumber();
	}

}
