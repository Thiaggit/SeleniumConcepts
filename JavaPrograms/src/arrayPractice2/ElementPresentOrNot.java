package arrayPractice2;

public class ElementPresentOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a1[] = {1,2,3,4};
		
		int toFind = 4;
		
		boolean status = false;
		
		for (int i : a1) {
			if(i==toFind) {
				status = true;
				break;
			}
		}
		if(status=true) {
			System.out.println("The element is present");
		}else
		{
			System.out.println("The element is not present");
		}
	}

}
