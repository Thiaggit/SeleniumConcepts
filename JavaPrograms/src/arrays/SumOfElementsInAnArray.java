package arrays;

public class SumOfElementsInAnArray {

	public void FindSum() {
		int given[] = {1,6,15,54,54,6,6};
		
		int sum=0;
		
//		for(int i=0;i<given.length;i++) {
//			sum = sum+given[i];
//		}
		
		for (int x : given) {
			sum =sum+x;
		}
	
		System.out.println("The sum of the elements in an array are " + sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfElementsInAnArray obj = new SumOfElementsInAnArray();
		obj.FindSum();
	}

}
