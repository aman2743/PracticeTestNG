package dataProviderInTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TwoDimensionalArray2 {
	@Test(dataProvider = "dp2")

	public void Login(String uname, String pwd) {
		System.out.println(uname + ">>>" + pwd);

	}

	@DataProvider(name = "dp2")
	public String[][] TWODArray() {
		String[][] str = new String[][] { { "123", "test" }, { "QA", "MGR" } };
		return str;

	}
}
