package constructors;

public class ArgumentConstructor {

	int a,b;
	static float c;
	
	ArgumentConstructor(int first_no, int second_no){
		a=first_no;
		b=second_no;
		c=first_no+second_no;
	}
	
	public void addition() {
		System.out.println("The addition of two nmbers are"+ c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgumentConstructor obj1 = new ArgumentConstructor(10,16);
		obj1.addition();
		ArgumentConstructor obj2 = new ArgumentConstructor(110,16);
		obj2.addition();
		
		
	}

}
