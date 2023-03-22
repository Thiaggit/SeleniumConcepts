package arraysPractice1;

public class EqualArrays {
	
	public void findingEqualArrays() {
		int a1[] = {1,2,3,4,5};
		int a2[] = {1,2,3,4,6};
		
		boolean result = true;
		
		if(a1.length==a2.length) {
			for(int i=0;i<a1.length;i++) {
				if(a1[i]!=a2[i]) {
					result=false;
				}
			}
		}else {
			result = false;
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
		EqualArrays obj = new EqualArrays();
		obj.findingEqualArrays();
	}

}
