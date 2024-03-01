package invocationInTestNG;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvocationFirst2 {
	@Test
	public void InvocationTest() throws InterruptedException {
	 for (int i = 0; i < 5; i++) {
		
		System.out.println("Current Thread Name:"+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://randomuser.me/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		Thread.sleep(1000);
		System.out.println("Name:"+driver.findElement(By.id("user_value")).getText());
		
		driver.findElement(By.xpath("//li[@data-label='email']")).click();
		Thread.sleep(1000);
		System.out.println("Email:"+driver.findElement(By.id("user_value")).getText());
		
		driver.quit();
	 }	
	}
}
