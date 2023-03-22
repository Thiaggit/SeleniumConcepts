package arraysPractice1;

public class ElementPresentOrNot {
	
	public void FindingElementPresentOrNot() {
		int a1[] = {1,2,3,4,5};
		int toFind = 2;
		
		Boolean result=true; 
		
		for (int i : a1) {
			if(i==toFind) {
				result = true;
				break;
			}else {
				result=false;
			}
		}
		System.out.println("The element availability is " + result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElementPresentOrNot obj = new ElementPresentOrNot();
		obj.FindingElementPresentOrNot();
	}

}
