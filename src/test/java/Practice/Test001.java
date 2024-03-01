package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test001 {
	@Test(dataProvider="QATest")
	public void m1(String[] s1) {
		System.out.println(s1[0] + ">>>" + s1[1]);
	}

	@DataProvider(name = "QATest")
	public String[][] DTest() {
		String[][] str = new String[][] { 
			{ "QA", "Test" }, 
			{ "QA01", "Test01","One"},
			{ "QA02", "Test02","One1","Two2"} 
			};
		return str;
	}
}
