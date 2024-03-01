package dataProviderInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestFireBasicDataProvider {
	@Test(dataProvider = "LoginTest")
	public void Login(String uname,String pwd) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://demo.testfire.net/login.jsp");
		Thread.sleep(1000);
		driver.quit();
	}
	
	@DataProvider(parallel = true)
	public Object[][] LoginTest() {
		Object[][] data=new Object[6][2];
		data[0][0]="Admin1";
		data[0][1]="admin123";
		
		data[1][0]="Admin2";
		data[1][1]="admin12";
		
		data[2][0]="Admin3";
		data[2][1]="admin12";
		
		data[3][0]="Admin4";
		data[3][1]="admin12";
		
		data[4][0]="Admin5";
		data[4][1]="admin12";
		
		data[5][0]="Admin6";
		data[5][1]="admin12";
		
		return data;
	}
}
