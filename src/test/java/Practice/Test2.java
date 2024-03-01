package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {
	@Test(dataProvider="QATest")
//	public void m1(String[] s1) {
	public void m1(String s1) {
		System.out.println(s1);
	}

	@DataProvider(name = "QATest")
	public String[] DTest() {
		String[] str = new String[]  
			{ "QA", "Test", "Test01","One","Two2"} ;

		return str;
	}
}
