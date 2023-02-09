package statickeyword;

public class StaticVariable {

	static int var1 = 0;
	int var2 = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    var1 = 1;
    var1 = 3;
    var1 = 2;
    var1 = 33;
    var1 = 1000000;
    System.out.println(var1);  
    //Whatever values user changes, there is only single copy of variable is created and the latest value is stored in the variable
    StaticVariable obj = new StaticVariable();
    obj.var2=2;
    System.out.println(obj.var2);
	}

}
