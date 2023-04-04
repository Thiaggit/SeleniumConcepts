package arithmeticPractice2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n1=0;
        int n2=1;
        int n3;
        
        int num=10;
        
        for(int i=0;i<=num;i++) {
        	System.out.print(n1 + " ");
        	n3=n1+n2;
        	n1=n2;
        	n2=n3;
        }
	}

}
