package dataProviderInTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class JaggedArray2 {

	@Test (dataProvider = "dp3")
	public void Login(String[] s) {
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println(">>>>>>>>>>>");
	}
	
	
	
	@DataProvider(name="dp3")
	public String [][] Jagged() {
		String[][] str=new String[][] {
			{"Qa","Test","Mgr","Lead"},
			{"Dev","SRDev"},
			{"BA","SRBA","LBA"}};
			return str;
    }
}

