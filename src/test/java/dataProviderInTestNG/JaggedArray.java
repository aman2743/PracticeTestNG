package dataProviderInTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JaggedArray {

	@Test (dataProvider = "dp3")
	public void Login(Object[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println(">>>>>>>>>>>");
	}
	
	
	
	@DataProvider(name="dp3")
	public Object [][] Jagged() {
		Object[][] str=new Object[][] {
			{"Qa","Test","Mgr","Lead"},
			{"Dev","SRDev"},
			{"BA","SRBA","LBA"}};
			return str;
    }
}

