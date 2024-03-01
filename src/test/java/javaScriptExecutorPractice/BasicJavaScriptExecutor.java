package javaScriptExecutorPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicJavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.testfire.net/login.jsp");
		Thread.sleep(1000);
//		WebElement uname=driver.findElement(By.id("uid"));
//		js.executeScript("arguments[0].value ='jsmith'",uname);
		js.executeScript("document.getElementById('uid').value='jsmith';");
		
//		WebElement pwd=driver.findElement(By.id("passw"));
//		js.executeScript("arguments[0].value = 'demo1234'",pwd);
		js.executeScript("document.getElementById('passw').value='demo1234';");
//		document.getElementById('passw').value='demo1234';
		
		WebElement btn=driver.findElement(By.name("btnSubmit"));
		js.executeScript("arguments[0].style.color='red'",btn);
		
//		js.executeScript("document.getElementByName('btnSubmit').click();");//Will not work
		Thread.sleep(1000);
		js.executeScript("arguments[0].click()",btn);
		
//		js.executeScript("arguments[0].style.color='red'",driver.findElement(By.id("btnGetAccount")));	
		driver.quit();
   }
}