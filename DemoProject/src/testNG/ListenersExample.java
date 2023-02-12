package testNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersExample implements ITestListener {
	
	public void OnStart(ITestResult result) {
	   System.out.println("OnStart");
	}
	
	public void OnFinish(ITestResult result) {
		   System.out.println("OnFinish");
		}
	
	public void OnTestSuccess(ITestResult result) {
		   System.out.println("OnTestSuccess");
		}
	
	public void OnTestFailure(ITestResult result) {
		   System.out.println("OnTestFailure");
		}

}
