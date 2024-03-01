package captureScreenshotFramework;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		try {
//			captureScreenshot(result.getMethod().getMethodName() + ".png");
			System.out.println(result.getTestContext().getName()+"_"+result.getMethod().getMethodName());
			captureScreenshot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName() + ".png");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
