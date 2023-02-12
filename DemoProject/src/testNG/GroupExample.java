package testNG;

import org.testng.annotations.Test;

public class GroupExample {

	@Test(groups = {"First"})
	public void method1() {
		System.out.println("This is first group");
	}
	@Test(groups = {"First"})
	public void method2() {
		System.out.println("This is first group");
	}
	@Test(groups = {"second"})
	public void method3() {
		System.out.println("This is second group");
	}
	@Test(groups = {"second"})
	public void method4() {
		System.out.println("This is second group");
	}
	@Test(groups = {"Third"})
	public void method5() {
		System.out.println("This is Third group");
	}
	@Test(groups = {"Third"})
	public void method6() {
		System.out.println("This is Third group");
	}
}
