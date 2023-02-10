package exceptionHandling;

public class SimpleExceptionHandlingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int num1 = 1;
			int num2 =0;
			int num3 = num1/num2;
			System.out.println(num3);
		}
		catch(ArithmeticException e){
			System.out.println("Dont divide by zero ArithmeticException");
		}
		
		catch(NullPointerException e){
			System.out.println("Dont divide by zero NullPointerException");
		}
		
		catch(Exception e){
			System.out.println("Dont divide by zero Exception");
		}
		
		finally {
			System.out.println("I am finally block");
		}
	}

}
