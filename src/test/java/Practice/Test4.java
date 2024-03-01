package Practice;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test4 {
	@Test(dataProvider="ArrLst")
	public void Test12(String [] arr) {
		System.out.println(arr[0]+" >>"+arr[1]);
	}

 @DataProvider
	public Iterator<String[]> ArrLst() {
		ArrayList<String[]> al=new ArrayList<>();
		al.add(new String[] {"Test","QA"});
		al.add(new String[] {"Test1","QA1"});
		al.add(new String[] {"Test2","QA2"});
		return al.iterator();
		
	}
	
	
}
