package javaScriptExecutorPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HighlightJavascriptExecutor {
	@Test
	public void BorderBackGround() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
    	 WebDriver driver=new ChromeDriver();
    	 driver.manage().window().maximize();
    	 Thread.sleep(1000);
    	 driver.manage().window().maximize();
    	 driver.get("https://demo.testfire.net/login.jsp");
//    	 Thread.sleep(3000);
    	 JavascriptExecutor js=(JavascriptExecutor) driver;
    	 js.executeScript("document.getElementById('uid').style.border='2px solid green'");
    	 js.executeScript("document.getElementById('passw').style.border='2px solid red'");
    	 
    	 
	}
}
