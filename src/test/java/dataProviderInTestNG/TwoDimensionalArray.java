package dataProviderInTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDimensionalArray {
	@Test(dataProvider = "dp2")

	public void Login(String[] s) {
		System.out.println(s[0] + ">>>" + s[1]);

	}

	@DataProvider(name = "dp2")
	public String[][] TWODArray() {
		String[][] str = new String[][] { { "123", "test" }, { "QA", "MGR" } };
		return str;

	}
}
