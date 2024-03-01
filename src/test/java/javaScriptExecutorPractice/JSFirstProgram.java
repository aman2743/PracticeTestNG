package javaScriptExecutorPractice;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSFirstProgram {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.testfire.net/login.jsp");
		Thread.sleep(1000);
//		FindElement(JS)+EnterText(JS)
        js.executeScript("document.getElementById('uid').value='amank'");
		
//		FindElement(WebDriver)+EnterText(JS)
//		WebElement we=driver.findElement(By.id("uid"));
//	    js.executeScript("arguments[0].value='Test1'",we);
	    
//	    return the object
		String str=(String) js.executeScript("return document.getElementById('uid').value");
		System.out.println(str);
		driver.quit();
        
	}
}
