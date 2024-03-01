package dataProviderInTestNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IteratorObject {
  @Test(dataProvider ="IteratorObjectReturn")
  public void Login(String str) {
	  System.out.println(str);
  }
	
	@DataProvider
	public Iterator<String> IteratorObjectReturn() {
		List<String> lst=new ArrayList<>();
		lst.add("Qa");
		lst.add("Mgr");
		lst.add("QA1");
		return lst.iterator();
		
		
	}
}
