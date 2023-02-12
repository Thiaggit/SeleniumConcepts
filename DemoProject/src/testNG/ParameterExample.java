package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {

	@Test
	@Parameters("Name")
	public void method(String name) {
		System.out.println("My name is "+name);
	}
}
