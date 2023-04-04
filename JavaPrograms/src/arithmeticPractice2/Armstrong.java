package arithmeticPractice2;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num = 153;
        int sum = 0;
        int temp = num;
        
        while(num>0) {
        	int rem = num%10;
        	sum=sum+rem*rem*rem;
        	num=num/10;
        }
        
        if(temp==sum) {
        	System.out.println("This is armstrong number");
        }
        else {
        	System.out.println("This is not armstrong number");
        }
	}

}
