package dataProviderInTestNG;

import org.testng.annotations.Test;

public class BasicDataProvider2 {
	@Test(dataProvider = "dp1", dataProviderClass = BasicDataProvider2_DataSupplier.class)
	public void Login(String s) {
		System.out.println(s);
	}
}