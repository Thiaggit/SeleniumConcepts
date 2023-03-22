package arithmetic;

public class Armstrong {

	public void findArmstrongNo() {
		int n = 153;
		int temp=n;
		int sum = 0;
		
		while(n>0) {
			int rem = n%10;
			sum = sum + rem*rem*rem;
			n=n/10;
		}
		

		if(temp==sum) {
			System.out.println("The number is a Armstrong number");
		}else {
			System.out.println("The number is not a Armstrong number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armstrong obj = new Armstrong();
		obj.findArmstrongNo();
	}

}
