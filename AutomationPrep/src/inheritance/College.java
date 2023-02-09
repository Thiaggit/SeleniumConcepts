package inheritance;

public class College extends University{
	
	public String College = "Govt College of Tech CBE";
			
	public void Method2() {
		System.out.println("Mechanical Engineering");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		College name = new College();
		System.out.println(name.Univ);
		System.out.println(name.College);
		name.Method2();
		name.method();
	}

}
