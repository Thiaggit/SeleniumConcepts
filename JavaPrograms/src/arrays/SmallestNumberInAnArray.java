package arrays;

public class SmallestNumberInAnArray {
	
       public void findSmallestNumber() {
    	   
    	   int given[] = {52,89,44,2,45,1,5,0,9};
    	   
    	   int smallestNumber = Integer.MAX_VALUE;
    	   
    	   for(int i = 0;i<given.length;i++) {
    		   if(given[i]<smallestNumber) {
    			   smallestNumber=given[i];
    		   }
    	   }
    	   System.out.println("The smallest number is " + smallestNumber);
       }
       
       public static void main(String[] args) {
		
    	   SmallestNumberInAnArray obj = new SmallestNumberInAnArray();
    	   obj.findSmallestNumber();
	}

}
