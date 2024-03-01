package dataProviderInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicDataProvider_Chrome {
	@Test(dataProvider = "LoginTest")
	public void Login(String uname,String pwd) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p']")).isDisplayed());
		driver.quit();
	}
	
	@DataProvider(parallel = true)
	public Object[][] LoginTest() {
		Object[][] data=new Object[6][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Test";
		data[1][1]="admin12";
		
		data[2][0]="Test";
		data[2][1]="admin12";
		
		data[3][0]="Test";
		data[3][1]="admin12";
		
		data[4][0]="Test";
		data[4][1]="admin12";
		
		data[5][0]="Test";
		data[5][1]="admin12";
		
		return data;
	}
}
