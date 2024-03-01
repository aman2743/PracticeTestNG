package Practice;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test3 {
	@Test(dataProvider="QATest",dataProviderClass = Test2.class)
	public void m1(String s) {
		System.out.println(s);
	}

	@DataProvider(name = "QATest",indices = {0,2})
	public Iterator<String> ItrTest() {
		ArrayList<String> lst=new ArrayList<>();
		lst.add("Test");
		lst.add("QA");
		lst.add("Demo");
		lst.add("Wow");
		return lst.iterator();
	}
}
