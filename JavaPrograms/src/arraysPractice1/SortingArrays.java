package arraysPractice1;

import java.util.Arrays;

public class SortingArrays {
	
	public void arraySort() {
		int a1[] = {1,5,7,9,3,4};
		System.out.println("Arrays before sorting " + Arrays.toString(a1));
		Arrays.sort(a1);
		System.out.println("Arrays after sorting " + Arrays.toString(a1));
	}
	
	public void arraySortOwnLogic() {
		int a1[] = {1,5,7,9,3,4};
		int n = a1.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(a1[j]>a1[j+1]) {
					int temp = a1[j];
					a1[j]=a1[j+1];
					a1[j+1]=temp;
				}
			}
		}
		System.out.println("Arrays after sorting " + Arrays.toString(a1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortingArrays obj = new SortingArrays();
//		obj.arraySort();
		obj.arraySortOwnLogic();
	}

}
