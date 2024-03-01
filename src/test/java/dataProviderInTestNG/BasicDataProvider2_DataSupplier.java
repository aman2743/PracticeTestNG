package dataProviderInTestNG;

import org.testng.annotations.DataProvider;

public class BasicDataProvider2_DataSupplier {
	@DataProvider(name = "dp")
	public String[] DataProviderMethod() {
		String[] data = new String[] { "Test", "QA", "HR", "Admin" };
		return data;
	}

	@DataProvider(name = "dp1")
	public String[] DataProviderMethod1() {
		String[] str = new String[] { "Test1", "QA1", "HR1", "Admin1" };
		return str;
	}

	public class BasicDataProvider2_DataSupplier1 {
		@DataProvider(name = "dp2")
		public String[] DataProviderMethod() {
			String[] data = new String[] { "Test", "QA", "HR", "Admin" };
			return data;
		}

		@DataProvider(name = "dp3")
		public String[] DataProviderMethod1() {
			String[] str = new String[] { "Test1", "QA1", "HR1", "Admin1" };
			return str;
		}
	}
}