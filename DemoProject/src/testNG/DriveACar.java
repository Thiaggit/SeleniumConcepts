package testNG;

import org.testng.annotations.Test;

public class DriveACar {

	@Test(priority=-1)
	public void StartCar() {
		System.out.println("StartCar");
	}
	@Test(priority=0, enabled = false)
	public void StartMusic() {
		System.out.println("StartMusic");
	}
	@Test(priority=1, dependsOnMethods = "StartCar")
	public void FirstGear() {
		System.out.println("First Gear");
	}
	@Test(priority=2) //This test case only executes first
	public void SecondGear() {
		System.out.println("Second Gear");
	}
	@Test(priority=3)
	public void ThirdGear() {
		System.out.println("Third Gear");
	}
	@Test(priority=4)
	public void FourthGear() {
		System.out.println("Fourth Gear");
	}
	@Test(priority=5)
	public void FifthGear() {
		System.out.println("Fifth Gear");
	}
}
