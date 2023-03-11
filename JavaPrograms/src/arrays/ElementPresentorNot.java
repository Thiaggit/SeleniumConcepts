package arrays;

public class ElementPresentorNot {

	public void findTheElementPresentOrNot() {
		int given[]= {1,56,87,56,86};
		
		int toFind=6;
		
		Boolean result=false;
		
		for (int i : given) {
			if(i==toFind) {
				result=true;
			}else {
				result=false;
			}
		}
		System.out.println("The element availability is " + result);;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElementPresentorNot obj = new ElementPresentorNot();
		obj.findTheElementPresentOrNot();
	}

}
