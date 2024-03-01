package dataProviderInTestNG;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IteratorObjectArray {
  @Test(dataProvider ="IteratorObjectReturn")
  public void Login(String[] str) {
	  System.out.println(str[0]+">>"+str[1]);
  }
	
	@DataProvider
	public Iterator<String[]> IteratorObjectReturn() {
		List<String[]> lst=new ArrayList<>();
		lst.add(new String[]{"QA","Test"});
		lst.add(new String[]{"QA1","Test1"});
		lst.add(new String[] {"One","Two"});
		return lst.iterator();
		
		
	}
}
