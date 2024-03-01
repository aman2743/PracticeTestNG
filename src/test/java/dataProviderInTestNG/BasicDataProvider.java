package dataProviderInTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicDataProvider {
	@Test(dataProvider = "LoginTest")
	public void Login(String uname,String pwd) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		Assert.assertTrue(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p']")).isDisplayed());
		driver.quit();
	}
	
	@DataProvider
	public Object[][] LoginTest() {
		Object[][] data=new Object[2][2];
		data[0][0]="Admin";
		data[0][1]="admin123";
		
		data[1][0]="Test";
		data[1][1]="admin12";
		
		return data;
	}
}
