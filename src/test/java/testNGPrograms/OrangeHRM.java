package testNGPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
	WebDriver driver;
  @Test
  public void LaunchApp() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  Thread.sleep(10000);
	  System.out.println("Orange HRM launched successfully");
  }
  @Test
  public void UserLogin() throws InterruptedException {
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  Thread.sleep(1000);
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();  
	  Thread.sleep(5000);
	  System.out.println("Inside Login Page");
  }
  @Test
  public void VerifyLogin()
  {
	   String str=driver.getTitle();
	   
	   if(str.equals("OrangeHRM")) {
		   System.out.println("User login successfully");
	   }
	   else{
		   System.out.println("User not login successfully");
	   }
	 driver.quit();  
  }
}

