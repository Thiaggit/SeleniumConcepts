package strings;

public class StringProblem {
	
	public void method() {
		String str[] = {"Thiagu", "Thiagu", "Nirmala"};
		int num1 = str.toString().indexOf("Thiagu");
		int num2 = str.toString().indexOf("Nirmala");
		System.out.println(num1 + num2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringProblem obj = new StringProblem();
		obj.method();
	}

}
