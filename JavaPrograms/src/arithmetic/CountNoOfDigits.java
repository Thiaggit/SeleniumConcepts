package arithmetic;

public class CountNoOfDigits {

	public void FindtheCountofDigits() {
		int num = 123456;
		int count = 0;
		while (num>0) {
			num = num/10;
			count = count+1;
			
		}
		System.out.println("The count of digits are " + count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountNoOfDigits obj = new CountNoOfDigits();
		obj.FindtheCountofDigits();
	}

}
