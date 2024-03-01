package testNGPrograms;

import org.testng.annotations.Test;

public class TestGroupDepenedncy {
	@Test(groups = { "Smoke" })
	public void Test1() {
		System.out.println("Smoke");
	}

	@Test(groups = {"Smoke"})
	public void Test2() {
		System.out.println(10 / 0);
	}

	@Test(groups = {"Sanity"})
	public void Test3() {
		System.out.println("Sanity");
	}

	@Test(groups = {"Sanity"})
	public void Test4() {
		System.out.println("Sanity");
	}

	@Test(groups = {"Regression"})
	public void Test5() {
		System.out.println("Regression");
	}

	@Test(groups = {"Regression"})
	public void Test6() {
		System.out.println("Regression");
	}

}
