package listenersInTestNG;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListenerClass.class)
public class TestClassSuiteLevel {
	@Test
	public void Test1() {
		System.out.println("Inside Test1");
	}
	@Test
	public void Test2() {
		System.out.println("Inside Test2");
		Assert.assertTrue(false);
	}
	@Test(timeOut = 1000)
	public void Test3() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Inside Test3");
	}
	@Test(dependsOnMethods = {"Test3"})
	public void Test4() {
		System.out.println("Inside Test4");
	}
	

}
