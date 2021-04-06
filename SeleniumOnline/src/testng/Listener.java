package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("onTestStart code");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("onTestSuccess code");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("onTestFailure code");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("onTestSkipped code");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("onStart code");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("onFinish code");

	}

}
