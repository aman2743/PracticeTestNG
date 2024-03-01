package javaScriptExecutorPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickJavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException {
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		//Select 
	    js.executeScript("document.getElementById('femalerb').click()");
		List lst=(List)js.executeScript("return document.getElementsByName('language')");
		for (Object object : lst) {
			js.executeScript("arguments[0].click()", object);
		}
        js.executeScript("document.getElementById('registerbtn').click();");
        Thread.sleep(5000);
        
//       FindElement(WebDriver)+Click(JavaScript)
        WebElement we=driver.findElement(By.xpath("//a[text()='Click here to navigate to the home page']"));
        js.executeScript("arguments[0].click()",we);
        
   }
}