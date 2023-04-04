package arrays;

import java.util.Arrays;

public class ArraysEqualOrNot {

	//Method1
	public void UsingInBuiltArrays() {
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,5};
		
		boolean result = Arrays.equals(a1, a2);
		
		if(result=true) {
			System.out.println("The arrays are equal");
		}else {
			System.out.println("The arrays are not equal");
		}
		
	}
	
	//Method2
	public void UsingOwnLogic() {
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,5};
		
		boolean result = true;
	
		if(a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					result=false;
				}
			}
		}else {
			result = true;
		}
		if(result==true) {
			System.out.println("The arrays are equal");
		}
		else {
			System.out.println("The arrays are not equal");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysEqualOrNot obj = new ArraysEqualOrNot();
		//obj.UsingInBuiltArrays();
		obj.UsingOwnLogic();
	}

}
