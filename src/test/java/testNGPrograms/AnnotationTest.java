package testNGPrograms;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationTest {
	@Test
	public void TestMethod1() {
		System.out.println("inside Test Method1");
	}
	@Test
	public void TestMethod2() {
		System.out.println("inside Test Method22");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("inside BeforeMethod");
	}


	@AfterMethod
	public void afterMethod() {
		System.out.println("inside AfterMethod");
	}


	@BeforeClass
	public void beforeClass() {
		System.out.println("inside BeforeClass");
	}


	@AfterClass
	public void afterClass() {
		System.out.println("inside AfterClass");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("inside BeforeTest");
	}


	@AfterTest
	public void afterTest() {
		System.out.println("inside AfterTest");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("inside BeforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("inside AfterSuite");
	}

}
