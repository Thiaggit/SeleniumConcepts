package arrays;

public class LargestNumberInAnArray {

	public void findLargestNumber() {
 	   
 	   int given[] = {52,44,2,45,1,5,0,989};
 	   
 	   int largestNumber = Integer.MIN_VALUE;
 	   
 	   for(int i = 0;i<given.length;i++) {
 		   if(given[i]>largestNumber) {
 			  largestNumber=given[i];
 		   }
 	   }
 	   System.out.println("The largest number is " + largestNumber);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestNumberInAnArray obj = new LargestNumberInAnArray();
		obj.findLargestNumber();
	}

}
